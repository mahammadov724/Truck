package az.developia.spring_proyekt_2setyabr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import az.developia.spring_projekt_2sentyabr.entity.Book;


@Controller
public class BookController {
	

    @GetMapping(path = "/kitablar")
    public String showBooks(@RequestParam(name = "q") String q) {
    	List<Book> books = new ArrayList<>();
    	books.add(new Book(1234,"Cinayet ve Ceza",123.60,234));
    	books.add(new Book(12634,"Cinayet ve Ceza",2123.60,6234));
    	books.add(new Book(12234,"Cinayet ve Ceza",6123.60,2234)); 

        List<String> BooksFiltered = new ArrayList<String>();
        for (String book : BooksFiltered) {
			if (book.contains(q)) {
				BooksFiltered.add(book);
			}
		}
        System.out.println(BooksFiltered);
        return "books";
    }
}
