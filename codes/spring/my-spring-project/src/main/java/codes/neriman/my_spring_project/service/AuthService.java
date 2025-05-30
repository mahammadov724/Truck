package codes.neriman.my_spring_project.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import codes.neriman.my_spring_project.dto.AuthRequestDto;
import codes.neriman.my_spring_project.entity.Authorities;
import codes.neriman.my_spring_project.entity.Reader;
import codes.neriman.my_spring_project.exception.InvalidCredentialsException;
import codes.neriman.my_spring_project.exception.OurRunTimeException;
import codes.neriman.my_spring_project.repository.AuthorityRepository;
import codes.neriman.my_spring_project.repository.BookRepository;
import codes.neriman.my_spring_project.repository.ReaderRepository;
import codes.neriman.my_spring_project.util.JwtUtil;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

	private final JwtUtil jwtUtil;
	private final ReaderRepository readerRepository;
	private final BookRepository bookRepository;
	private final PasswordEncoder passwordEncoder;
	private final AuthorityRepository authorityRepository;

	public String create(AuthRequestDto dto) {
		Optional<Reader> byUsername = readerRepository.findByUsername(dto.getUsername());
		if (byUsername.isPresent()) {
			throw new OurRunTimeException(null, "Username already exists");
		}

		String encodedPassword = passwordEncoder.encode(dto.getPassword());

		Reader reader = new Reader();
		reader.setId(null);
		reader.setName(dto.getName());
		reader.setUsername(dto.getUsername());
		reader.setPassword(encodedPassword);
		readerRepository.save(reader);

		Authorities authority = new Authorities();
		authority.setUsername(reader.getUsername());
		authority.setAuthority("ROLE_ADD_READER");
		authorityRepository.save(authority);

		return "User successfully registered!";
	}

	public String login(AuthRequestDto dto) {
		Optional<Reader> user = readerRepository.findByUsername(dto.getUsername());

		if (!user.isPresent() || !passwordEncoder.matches(dto.getPassword(), user.get().getPassword())) {
			throw new InvalidCredentialsException("Username or password is incorrect");
		}

		List<String> authorityList = authorityRepository.findUserAuthority(user.get().getUsername()).stream()
				.map(Authorities::getAuthority).collect(Collectors.toList());

		return jwtUtil.generateToken(user.get().getUsername());
	}

	public ResponseEntity<Map<String, String>> getUserDetail(String token) {
		if (token.startsWith("Bearer ")) {
			token = token.substring(7);
		}
		Map<String, String> claims = jwtUtil.extractClaims(token);
		return ResponseEntity.ok(claims);
	}

	public void delete(Integer id) {
		if (id == null || id <= 0) {
			throw new OurRunTimeException(null, "ID is required");
		}

		Optional<Reader> byId = readerRepository.findById(id);
		if (byId.isPresent()) {
			Reader reader = byId.get();
			readerRepository.deleteById(id);
			bookRepository.deleteBookInfo(reader.getId());
		} else {
			throw new OurRunTimeException(null, "ID not found");
		}
	}

}
