package codes.neriman.my_spring_project.service;

import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.exception.OurRunTimeException;
import codes.neriman.my_spring_project.repository.BookRepository; 
import codes.neriman.my_spring_project.responce.BookResponce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookResponce getBooks() {
        List<Book> books = bookRepository.findAll(); 
        BookResponce response = new BookResponce();
        response.setBooks(books); 
        response.setLength(books.size()); 
        return response;
    }
    
    public void delete(Integer id) {
    	if (id == null || id <= 0) {
			throw new OurRunTimeException(null,"id tapilmadi");
		}
    	Optional<Book> byId = bookRepository.findById(id);
    	if (byId.isPresent()) {
			bookRepository.deleteById(id);
		} else {
			throw new OurRunTimeException(null,"id tapilmadi");
		}
    }
    
    public List<Book> search(String query) {
        List<Book> all = bookRepository.findAll();
        if (query == null || query.isEmpty()) {
            return all;
        }

        return all.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()) || 
                                book.getAuthor().toLowerCase().contains(query.toLowerCase())) 
                .collect(Collectors.toList());
    }


}
