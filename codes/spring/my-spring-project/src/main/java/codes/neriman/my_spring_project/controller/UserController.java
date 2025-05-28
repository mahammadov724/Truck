package codes.neriman.my_spring_project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import codes.neriman.my_spring_project.dto.RequestDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody @Valid RequestDto requestDto) {
        return ResponseEntity.ok("Email doğrudur");
    }
}