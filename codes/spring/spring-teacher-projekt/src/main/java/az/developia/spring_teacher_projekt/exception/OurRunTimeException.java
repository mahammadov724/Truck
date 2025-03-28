package az.developia.spring_teacher_projekt.exception;

import org.springframework.validation.BindingResult;

public class OurRunTimeException extends RuntimeException{
	private BindingResult br;

	public OurRunTimeException(BindingResult br,String message) {
		super(message);
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}
}
