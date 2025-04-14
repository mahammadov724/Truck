package codes.neriman.my_spring_project.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;


import codes.neriman.my_spring_project.dto.AuthRequestDto;
import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.repository.BookRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
	private final BookRepository bookRepository;
	
	public String create(AuthRequestDto dto) {
		Book book = new Book();
		book.setAuthor(dto.getAuthor());
		book.setId(dto.getId());
		book.setTitle(dto.getTitle());
		book.setYear(dto.getYear());
		bookRepository.save(book);
		return "Book yaradildi :D";
	}

}
