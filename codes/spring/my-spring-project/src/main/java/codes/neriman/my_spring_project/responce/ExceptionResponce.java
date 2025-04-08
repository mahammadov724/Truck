package codes.neriman.my_spring_project.responce;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ExceptionResponce {
	private String message;
	private List<ValidationResponse> validations;
}
