package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {
	 @GetMapping("/books")
	    public String getBooks() {
	        return "books";  
	    }
}
