package codes.neriman.my_spring_project.exception;

public class InvalidCredentialsException extends RuntimeException{
	public InvalidCredentialsException(String m) {
		super(m);
	}
}
