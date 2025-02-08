package az.developia.librarian.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import az.developia.librarian.entity.Librarianentity;
import az.developia.librarian.exception.MyRuntimeException;

public class librarianrepository {

	public void add(Librarianentity librarian) throws MyRuntimeException {

		if (librarian.getName().length() > 45) {
			throw new MyRuntimeException("Ad max 45 simvol ola biler");
		}

		String query = "INSERT INTO teacher(name,surname,phone,address,username,password) VALUES " + "('"
				+ librarian.getName() + "','" + librarian.getSurname() + "','" + librarian.getPhone() + "','"
				+ librarian.getAddress() + "','" + librarian.getUsername() + "','" + librarian.getPassword() + "')";

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

	public boolean checkUser(String username) {

		boolean userExists = false;

		String query = "SELECT count(*) FROM teacher where username='" + username + "';";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_teacher?useSSL=false",
					"root", "bzkok8oxscfq");

			Statement st = conn.createStatement();
;
			ResultSet result = st.executeQuery(query);

			result.next();

			userExists = result.getInt(1) == 1 ? true : false;

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return userExists;

	}
	
	
	public boolean login(String username, String password) {

		boolean userExists = false;

		String query = "SELECT count(*) FROM teacher where username='" + username + "' and password='"+password+"';";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_teacher?useSSL=false",
					"root", "bzkok8oxscfq");

			Statement st = conn.createStatement();

			ResultSet result = st.executeQuery(query);

			result.next();

			userExists = result.getInt(1) == 1 ? true : false;

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return userExists;

	}
	//Yeni ders
	public Librarianentity getById(int id) {
	    Librarianentity librarian1 = null;

	    String query = "SELECT * FROM teacher WHERE id = " + id;

	    try {
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_teacher?useSSL=false", "root", "bzkok8oxscfq");
	        Statement st = conn.createStatement();
	        ResultSet result = st.executeQuery(query);

	        if (result.next()) {
	            librarian1.setId(result.getInt("id"));
	            librarian1.setName(result.getString("name"));
	            librarian1.setSurname(result.getString("surname"));
	            librarian1.setPhone(result.getString("phone"));
	            librarian1.setAddress(result.getString("address"));
	            librarian1.setUsername(result.getString("username"));
	            librarian1.setPassword(result.getString("password"));
	        }


	        conn.close();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }

	    return librarian1;
	}



	
}