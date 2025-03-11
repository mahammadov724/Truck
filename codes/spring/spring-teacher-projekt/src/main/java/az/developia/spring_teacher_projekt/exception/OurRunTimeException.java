package az.developia.spring_teacher_projekt.exception;

import org.springframework.validation.BindingResult;

public class OurRunTimeException extends RuntimeException{
	private BindingResult br;

	public OurRunTimeException(BindingResult br) {
		super();
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}
}
