package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@GetMapping
    public String home() {
        return "home";  
    }
}
