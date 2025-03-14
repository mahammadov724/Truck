package az.developia.spring_teacher_projekt.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_teacher_projekt.exception.OurRunTimeException;
@RestControllerAdvice
public class ExceptionHandlers {
	@ExceptionHandler
	public String handler (OurRunTimeException exc) {
		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}
}
