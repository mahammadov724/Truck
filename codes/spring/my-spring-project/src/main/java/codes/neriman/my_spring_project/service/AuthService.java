package codes.neriman.my_spring_project.service;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import codes.neriman.my_spring_project.dto.AuthRequestDto;
import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.entity.Reader;
import codes.neriman.my_spring_project.repository.BookRepository;
import codes.neriman.my_spring_project.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
	private final BookRepository bookRepository;
	private final PasswordEncoder passwordEcodocer;
	private final UserRepository userRepository;
	
	public String create(AuthRequestDto dto) {
		Optional<User> byUsername = userRepository.findByUsername(dto.getUsername());
		if (byUsername.isPresent()) {
			throw new RuntimeException("Username is exsist");
		}
		
		String encode = passwordEcodocer.encode(dto.getPassword());
		
		Reader reader = new Reader();
		reader.setId(null);
		reader.setName(dto.getName());
		reader.setUsername(dto.getUsername());
		reader.setPassword(encode);
		bookRepository.save(reader);
		return "Book yaradildi :D";
	}
	
	public String login (AuthRequestDto dto) {
		Optional<User> user = userRepository.findByUsername(dto.getUsername());
		if (!user.isPresent()) {
			throw new RuntimeException("User not found");
		}
		if (!passwordEcodocer.matches(dto.getPassword(), user.get().getPassword())) {
			throw new RuntimeException("Password Incorrect");
		}
		return jwtUtil.generateToken(user.get().getUsername());
	}

}
