package az.developia.librarian.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import az.developia.librarian.entity.LibrarianGroupEntity;
import az.developia.librarian.exception.MyRuntimeException;
import java.util.ArrayList;
public class LibrarianGroupRepository {
public void addGroup(LibrarianGroupEntity teacherGroup) {
		
		
		String query = "INSERT INTO teacher_group(name,register_date,teacher_id) VALUES "
				+ "('"+teacherGroup.getName()
				+"','"+teacherGroup.getRegister_date()
				+"','"+teacherGroup.getTeacher_id()+"')";
				
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_teacher?useSSL=false",
					"root", "2004");

			Statement st = conn.createStatement();

			st.executeUpdate(query);

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public ArrayList<LibrarianGroupEntity> getAllLibrarianGroup(Integer id){
		
		ArrayList<LibrarianGroupEntity> LibrarianGroup=new ArrayList<LibrarianGroupEntity>();
		
		String query="SELECT * FROM teacher_group where teacher_id='"+id+"';";
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_teacher?useSSL=false",
					"root", "2004");

			Statement st = conn.createStatement();

			
			ResultSet result=st.executeQuery(query);
			
			while (result.next()) {
				LibrarianGroupEntity group=new LibrarianGroupEntity();
				group.setId(result.getInt("Id"));
				group.setName(result.getString("name"));
				group.setRegister_date(result.getTimestamp("register_date").toLocalDateTime());
				group.setTeacher_id(result.getInt("teacher_id"));
				teacherGroup.add(group);
				
			}
			

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return teacherGroup;
	}
	
	
	public void deleteGroup(Integer id) {
		String query="DELETE FROM teacher_group WHERE Id='"+id+"';";
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_teacher?useSSL=false",
					"root", "2004");

			Statement st = conn.createStatement();

			st.executeUpdate(query);

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
