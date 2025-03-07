package az.developia.spring_projekt_2sentyabr.entity;
//a
import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_projekt_2sentyabr.exception.OurRunTimeException;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/students")
public class StudentRestController {
	@GetMapping
	public List<String> GetStudents(){
		List<String> students = new ArrayList<String>();
		students.add("Neriman");
		students.add("Resul");
		students.add("Geray");
		students.add("Ekber");
		students.add("Nihad");
		return students;
	}
	
	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody Book student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br);
		}
		System.out.println(student);
	}
	
	
}
