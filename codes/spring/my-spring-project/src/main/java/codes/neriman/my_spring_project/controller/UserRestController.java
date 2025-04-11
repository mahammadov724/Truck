package codes.neriman.my_spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codes.neriman.my_spring_project.dto.TeacherRequestDto;
import codes.neriman.my_spring_project.entity.TeacherEntity;
import codes.neriman.my_spring_project.entity.UserEntity;
import codes.neriman.my_spring_project.repository.TeacherRepository;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserRestController {
	
	@Autowired
	private TeacherRepository teacherRepository;
		
	@Autowired
	private TeacherRepository userRepository;

    @PostMapping(path = "/teacher")
    public void createTeacher(@RequestBody TeacherRequestDto d) {
        TeacherEntity t = new TeacherEntity();
        t.setId(null);
        t.setName(d.getName());
        t.setSurname(d.getSurname());
        
        UserEntity u = new UserEntity();
        
    }
}
