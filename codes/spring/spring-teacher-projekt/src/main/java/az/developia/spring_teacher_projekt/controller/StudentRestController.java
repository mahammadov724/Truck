package az.developia.spring_teacher_projekt.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//		students.add("Neriman");
//		students.add("Resul");
//		students.add("Geray");
//		students.add("Ekber");
//		students.add("Nihad");
		return students;
		
//		try {
//			Connection connection = dataSource.getConnection();
//			Statement st = connection.createStatement();
//			String query = "select * from students";
//			ResultSet executeQuery = st.executeQuery(query);
//			while (executeQuery.next()) {
//				Student s = new Student();
//				s.setId(executeQuery.getInt("id"));
//				s.setName(executeQuery.getName("name"));
//				s.setSurname(executeQuery.getSurname("surname"));
//				students.add(s);
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		return students;
	};
	
	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody Student student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br);
		}
		System.out.println(student);
	
//	try {
//		Connection connection = dataSource.getConnection();
//		Statement st = connection.createStatement();
//		String query = "insert into students(name,surname) values('"+student.getName()+"','"+student.getSurname()+"')";
//		st.executeUpdate(query);
//		connection.close();
//	} catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
		studentRepository.save(student);
	}
}
