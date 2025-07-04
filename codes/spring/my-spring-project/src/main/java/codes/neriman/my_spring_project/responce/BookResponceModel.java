package codes.neriman.my_spring_project.responce;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter(value = "books")
public class BookResponceModel {
	private Integer Id;
	private String title;
	private String genre;
	private Integer rating;
}
