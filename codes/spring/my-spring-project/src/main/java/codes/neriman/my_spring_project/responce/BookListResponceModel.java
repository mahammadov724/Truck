package codes.neriman.my_spring_project.responce;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookListResponceModel {
	private List<BookResponceModel> bookResponce;
}
