package codes.neriman.my_spring_project.service;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import codes.neriman.my_spring_project.dto.AuthRequestDto;
import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.entity.Reader;
import codes.neriman.my_spring_project.exception.InvalidCredentialsException;
import codes.neriman.my_spring_project.exception.OurRunTimeException;
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
		return "Istifadeci Qeydiyyatdan Kecti :D";
	}
	
	public String login (AuthRequestDto dto) {
		Optional<Reader> user = readerRepository.findByUsername(dto.getUsername());
		
		if (!user.isPresent() || !passwordEcodocer.matches(dto.getPassword(), user.get().getPassword())) {
			throw new InvalidCredentialsException("Username or Password Incorrect");
		}	
		
		return jwtUtil.generateToken(user.get().getUsername());
	}
	
	

}
