package codes.neriman.my_spring_project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.exception.OurRunTimeException;
import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.repository.BookRepository;
import codes.neriman.my_spring_project.responce.BookResponce;
import codes.neriman.my_spring_project.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/books")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Movie Controller",description = "Book apileri")
public class BookController {
	 @Autowired
	 private BookService bookService;
	 
	    @PostMapping
	    public Book createBook(@RequestBody Book book) {
	        return bookRepository.save(book);
	    }

	    @GetMapping("/{id}")
	    public Optional<Book> getBook(@PathVariable Integer id) {
	        return bookRepository.findById(id);
	    }
	    
	    @Operation(
				description = "Get api for Book",
				summary = "This is a summary for Book get api"
				)

	    @GetMapping
	    public List<Book> getAllBooks() {
	        return bookRepository.findAll();
	    }
	    
	    @PutMapping("/{id}")
	    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
	        if (bookRepository.existsById(id)) {
	            book.setId(id);
	            return bookRepository.save(book);
	        } else {
	            return null;
	        }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBook(@PathVariable Integer id) {
	       
	        if (id== null || id <= 0) {
				throw new OurRunTimeException(null, "id mutleqdir duzgun olsun");
			}
	        if (bookRepository.findById(id).isPresent()) {
	        	bookRepository.deleteById(id);
			}else {
				throw new OurRunTimeException(null, "id tapilmadi :<");
			}
	    }
	    
	    @GetMapping("/pagination/begin/{begin}/length/{length}")
	    public BookResponce pagination(@PathVariable Integer begin,@PathVariable Integer length) {
	        return bookRepository.pagination(begin,length);
	    }
	    
	    @GetMapping("/titles")
	    public List<String> getAllBookTitles() {
	        return bookRepository.findAllBookTitles();
	    }

	    
}