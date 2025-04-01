package az.developia.spring_teacher_projekt.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_teacher_projekt.dto.StudentRequestDto;
import az.developia.spring_teacher_projekt.entity.Student;
import az.developia.spring_teacher_projekt.exception.OurRunTimeException;
import az.developia.spring_teacher_projekt.repository.StudentRepository;
import jakarta.validation.Valid;
@RestController
@RequestMapping(path = "/students")
public class StudentRestController {
//	@Autowired
//	private DataSource dataSource;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping
	public List<String> GetStudents(){
		List<String> students = new ArrayList<String>();

		return students;
		
	};
	
	@GetMapping(path = "search")
	public List<Student> search(@RequestParam(name = "query",required = false) String query){
		List<Student> all = studentRepository.findAll();
		if (query == null) {
			return all;
		}
		return all.stream().filter(student -> student.getName().contains(query)).collect(Collectors.toList());
	}
	
	
	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody StudentRequestDto student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br,"sdasd");
		}
		
		Student s = new Student();
		s.setId(null);
		s.setName(student.getName());
		s.setSalary(student.getSalary());
		
		StudentRequestDto.save(student);
	}
	
	@PutMapping
	public void update(@Valid @RequestBody Student student,BindingResult br) {
		if(br.hasErrors()) {
			throw new OurRunTimeException(br,"melumatin tapilmasinda problem var");
		}
		if(student.getId()==0) {
			throw new OurRunTimeException(null,"id tapilmadi");
		}
		if(studentRepository.findById(student.getId()).isPresent()) {
			studentRepository.save(student);
		}else {
			throw new OurRunTimeException(null,"id tapilmadi");
		}
	}
	
	@DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        if (id == null || id <= 0) {
            throw new OurRunTimeException(null, "Id mutleqdir");
        }
        
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            studentRepository.deleteById(id);
            return ResponseEntity.ok("Student silindi");
        } else {
            throw new OurRunTimeException(null, "Student id ile tapilmadi");
        }
    }
	
}
