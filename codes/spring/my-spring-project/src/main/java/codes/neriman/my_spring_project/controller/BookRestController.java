package codes.neriman.my_spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codes.neriman.my_spring_project.exception.BindingResponse;
import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.exception.OurRunTimeException;
import codes.neriman.my_spring_project.repository.BookRepository;
import codes.neriman.my_spring_project.responce.BookResponce;
import codes.neriman.my_spring_project.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/Book")
@RequiredArgsConstructor
public class BookRestController {
	@Autowired
	private BookRepository bookrepository;
	
	private final BookService bookService;
	
	@GetMapping
	public BookResponce getBooks() {
		return bookService.getBooks();
		
	}
	
	@PostMapping
	public void addBook(@Valid @RequestBody Book book, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br,"Problem var melumatlarda");
		}
		
		book.setId(null);
	}
	
	@PutMapping
	public void update(@Valid @RequestBody Book book, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br,"error var");
		}
		
		if (book.getId()==null || book.getId()<=0) {
			throw new OurRunTimeException(br,"error var");
		}
		
		if (bookrepository.findById(book.getId()).isPresent()) {
			bookrepository.save(book);
		}else {
			throw new OurRunTimeException(br,"error var");
		}
	}
}
