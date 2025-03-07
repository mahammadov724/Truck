package az.developia.spring_projekt_2sentyabr.handler;
//a
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_projekt_2sentyabr.exception.OurRunTimeException;

@RestControllerAdvice
public class ExceptionHandlers {
	@ExceptionHandler
	public String handler (OurRunTimeException exc) {
		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}
}
