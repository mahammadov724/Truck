package az.developia.spring_proyekt_2setyabr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping
    public String home() {
        return "home";  
    }
}
