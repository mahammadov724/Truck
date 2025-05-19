package codes.neriman.my_spring_project.service;

import codes.neriman.my_spring_project.dto.BookRequestDto;
import codes.neriman.my_spring_project.entity.Book;
import codes.neriman.my_spring_project.entity.Reader;
import codes.neriman.my_spring_project.exception.OurRunTimeException;
import codes.neriman.my_spring_project.repository.BookRepository;
import codes.neriman.my_spring_project.repository.ReaderRepository;
import codes.neriman.my_spring_project.responce.BookResponce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private ReaderRepository readerRepository;

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
    
    public void add(BookRequestDto dto) {
    	String username = SecurityContextHolder.getContext().getAuthentication().getName();
    	Reader reader = readerRepository.getUserByUsername(username);
    	Integer id = reader.getId();
    	Book book = new Book();
    	book.setId(null);
    	book.setAuthor(dto.getAuthor());
    	book.setTitle(dto.getTitle());
    	book.setYear(dto.getYear());
    	book.setUserId(id);
    }
    
    public BookResponce get() {
    	BookResponce responce = new BookResponce();
    	responce.setBooks(bookRepository.findAll());
    	return responce;
    }
    
    List<Book> movies = bookRepository.findByUserId(id); 
    
    public BookResponce getMyOwn() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Book user = bookRepository.getBookByUsername(username);
        Integer id = user.getId();

        List<Book> books = bookRepository.findByUserId(id);
        Function<Book, String> f = new Function<Book, String>(){
        	@Override
        	public String apply(Book t) {
        		return t.getTitle();
        	}
        };

        List<String> filteredTitles = books.stream()
            .map(Book::getTitle)
            .filter(title -> title.contains("a"))
            .collect(Collectors.toList());

        BookResponce response = new BookResponce();
        response.setTitles(filteredTitles);
        return response;
    }


    public void deleteOwnBook(Integer id) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Reader reader = readerRepository.getUserByUsername(username);

        if (id == null || id <= 0) {
            throw new OurRunTimeException(null, "id mütləqdir");
        }

        Book book = bookRepository.findById(id).orElseThrow(() -> new OurRunTimeException(null, "id tapilmadi"));

        if (!book.getUserId().equals(reader.getId())) {
            throw new OurRunTimeException(null, "öz kitabını sil");
        }

        bookRepository.deleteById(id);
    }
    
	Book book = bookRepository.findById(id).orElseThrow(() -> new OurRuntimeException(null, "id tapilmadi"));
	
	Supplier<OurRunTimeException> s = new Supplier<OurRunTimeException>() {
		
		@Override
		public OurRunTimeException get() {
			return new OurRunTimeException(null, "id tapilmadi");
		}
	};


}
