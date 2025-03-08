package az.developia.spring_proyekt_2setyabr.controller;
import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.Statement;
//a
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

import az.developia.spring_projekt_2sentyabr.entity.Book;
import az.developia.spring_projekt_2sentyabr.exception.OurRunTimeException;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/students")
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
	public void addStudent(@Valid @RequestBody Book book,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRunTimeException(br);
		}
		System.out.println(book);
	
	
	try {
		Connection connection = dataSource.getConnection();
		Statement st = connection.createStatement();
		String query = "insert into book(name,price) values('"+book.getName()+"','"+book.getPrice()+"')";
		st.executeUpdate(query);
		connection.close();
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
	
}
