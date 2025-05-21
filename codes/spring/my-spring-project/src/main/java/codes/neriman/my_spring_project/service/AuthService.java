package codes.neriman.my_spring_project.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import codes.neriman.my_spring_project.dto.AuthRequestDto;
import codes.neriman.my_spring_project.entity.Authorities;
import codes.neriman.my_spring_project.entity.Book;
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
	private final PasswordEncoder passwordEcodocer;
	private final AuthorityRepository authorityRepository;
	
	public String create(AuthRequestDto dto) {
		Optional<Reader> byUsername = readerRepository.findByUsername(dto.getUsername());
		if (byUsername.isPresent()) {
			throw new OurRunTimeException(null,"Username Is Exsist");
		}
		
		String encode = passwordEcodocer.encode(dto.getPassword());
		
		Reader reader = new Reader();
		reader.setId(null);
		reader.setName(dto.getName());
		reader.setUsername(dto.getUsername());
		reader.setPassword(encode);
		readerRepository.save(reader);
		
		Authorities a1=new Authorities(); 
		a1.setUsername(reader.getUsername()); 
		a1.setAuthority("ROLE_ADD_READER"); 
		authorityRepository.save(a1); 
		
		return "Istifadeci Qeydiyyatdan Kecti :D";
	}
	
	public String login (AuthRequestDto dto) {
		Optional<Reader> user = readerRepository.findByUsername(dto.getUsername());
		
		if (!user.isPresent() || !passwordEcodocer.matches(dto.getPassword(), user.get().getPassword())) {
			throw new InvalidCredentialsException("Username or Password Incorrect");
		}	
		
		List<String> authorityList = authorityRepository.findUserAuthority(user.get().getUsername()).stream()
				.map(Authorities :: getAuthority)
				.collect(Collectors.toList());
		
		return jwtUtil.generateToken(user.get().getUsername());
		
	}

	public ResponseEntity<Map<String, String>> getUserDetail(String token) {
 		if (token.startsWith("Bearer")) {
 			token=token.substring(7);
 		}
 		Map<String,String> claims = jwtUtil.extractClaims(token);
 		return ResponseEntity.ok(claims);
 	}

	public ResponseEntity<Map<String, String>> getBookDetail(String token) {
		return null;
	}
	
	public void delete(Integer id) { 
		if (id == null || id<=0) { 
		throw new OurRunTimeException(null, "id mutleqdir"); 
		} 
		Optional<Reader> byId = readerRepository.findById(id);
		if (byId.isPresent()) { 
		Reader reader = byId.get(); 
		readerRepository.deleteById(id); 
		bookRepository.deleteBookInfo (reader.getId()); 
		}else { 
		throw new OurRunTimeException(null, "id tapilmadi"); }}

}
