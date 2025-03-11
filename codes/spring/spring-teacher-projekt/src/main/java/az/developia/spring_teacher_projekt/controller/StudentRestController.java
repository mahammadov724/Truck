package az.developia.spring_teacher_projekt.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import az.developia.spring_teacher_projekt.entity.Student;
import az.developia.spring_teacher_projekt.exception.OurRunTimeException;
import jakarta.validation.Valid;

public class StudentRestController {
	@Autowired
	private DataSource dataSource;
	
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
	public void addStudent(@Valid @RequestBody Student student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br);
		}
		System.out.println(student);
	
	
	try {
		Connection connection = dataSource.getConnection();
		Statement st = connection.createStatement();
		String query = "insert into book(name,price) values('"+student.getName()+"','"+student.getSurname()+"')";
		st.executeUpdate(query);
		connection.close();
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
