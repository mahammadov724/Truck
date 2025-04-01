package az.developia.spring_teacher_projekt.response;

import java.util.List;

import org.springframework.validation.FieldError;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
private String message;
private List<FieldError> validations;

public void setValidations(List<FieldError> fieldErrors) {
	// TODO Auto-generated method stub
	
}
	

}
