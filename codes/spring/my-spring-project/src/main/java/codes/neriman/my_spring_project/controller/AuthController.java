package codes.neriman.my_spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codes.neriman.my_spring_project.dto.AuthRequestDto;
import codes.neriman.my_spring_project.service.AuthService;

@RestController
@RequestMapping(path = "/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	@Autowired
	private AuthService service;
	
	@PostMapping(path = "/register")
	public String createUser(@RequestBody AuthRequestDto dto) {
		service.create(dto);
		return null;
	}
}
