package az.developia.spring_teacher_projekt.response;

public class ValidationResponse {
	private String field;
	private String ErrorMessage;

	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public void add(ValidationResponse validation) {
		
		
	}

}
