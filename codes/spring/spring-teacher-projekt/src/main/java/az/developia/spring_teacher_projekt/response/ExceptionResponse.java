package az.developia.spring_teacher_projekt.response;

import java.util.List;

import org.springframework.validation.FieldError;

public class ExceptionResponse {
private String message;
private List<FieldError> validations;
	
public String getMessge() {
	return message;
}
public void setMessge(String message) {
	message = message;
}
public List<FieldError> getValidations() {
	return validations;
}
public void setValidations(List<FieldError> validations) {
	this.validations = validations;
}

}
