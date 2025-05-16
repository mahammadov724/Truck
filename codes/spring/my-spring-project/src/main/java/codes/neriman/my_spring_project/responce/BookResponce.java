package codes.neriman.my_spring_project.responce;

import java.util.List;

import codes.neriman.my_spring_project.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookResponce {
	
	private List<Book> books;
	private double length;
	public void setTitles(List<String> filteredTitles) {
		// TODO Auto-generated method stub
		
	}

}
