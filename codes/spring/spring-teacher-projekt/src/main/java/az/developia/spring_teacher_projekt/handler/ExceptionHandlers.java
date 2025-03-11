package az.developia.spring_teacher_projekt.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;

import az.developia.spring_teacher_projekt.exception.OurRunTimeException;

public class ExceptionHandlers {
	@ExceptionHandler
	public String handler (OurRunTimeException exc) {
		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}
}
