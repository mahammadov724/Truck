package az.developia.spring_proyekt_2setyabr.controller;

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

import az.developia.spring_projekt_2sentyabr.entity.Book;
import az.developia.spring_projekt_2sentyabr.entity.Book1;
import az.developia.spring_projekt_2sentyabr.repository.BookRepository;

@RestController
@RequestMapping("/books1")
public class Book1Controller {
	 @Autowired
	    private BookRepository bookRepository;
	 
	    @PostMapping
	    public Book1 createBook(@RequestBody Book book) {
	        return bookRepository.save(book);
	    }

	    @GetMapping("/{id}")
	    public Optional<Book1> getBook(@PathVariable Long id) {
	        return bookRepository.findById(id);
	    }

	    @GetMapping
	    public List<Book1> getAllBooks() {
	        return bookRepository.findAll();
	    }
	    
	    @PutMapping("/{id}")
	    public Book1 updateBook(@PathVariable Long id, @RequestBody Book book) {
	        if (bookRepository.existsById(id)) {
	            book.setId(id);
	            return bookRepository.save(book);
	        } else {
	            return null;
	        }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBook(@PathVariable Long id) {
	        bookRepository.deleteById(id);
	    }
}
