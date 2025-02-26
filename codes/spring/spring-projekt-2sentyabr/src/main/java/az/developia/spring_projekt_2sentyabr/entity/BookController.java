package az.developia.spring_projekt_2sentyabr.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class BookController {

    @GetMapping(path = "/kitablar")
    public String showBooks(Model model) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Cinayet ve Ceza", "Fyodor Dostoyevski"));
        books.add(new Book("Sefiller", "Victor Hugo"));
        books.add(new Book("1984", "George Orwell"));

        model.addAttribute("books", books);

        return "books"; 
    }
}

