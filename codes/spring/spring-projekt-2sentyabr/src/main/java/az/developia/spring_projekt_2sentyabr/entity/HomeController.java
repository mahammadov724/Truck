package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping
    public String home() {
        return "home";  
    }
}
