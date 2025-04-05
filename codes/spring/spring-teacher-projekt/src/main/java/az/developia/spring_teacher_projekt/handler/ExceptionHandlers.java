package az.developia.spring_teacher_projekt.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_teacher_projekt.exception.OurRunTimeException;
import az.developia.spring_teacher_projekt.response.ExceptionResponse;
import az.developia.spring_teacher_projekt.response.ValidationResponse;
import jakarta.validation.Validation;

@RestControllerAdvice
public class ExceptionHandlers {
	
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ExceptionResponse handler (OurRunTimeException exc) {
		ExceptionResponse response =new ExceptionResponse();
		
		BindingResult br = exc.getBr();
		if(br==null) {
			
		}else {
			List<FieldError> fieldErrors = br.getFieldErrors();
			List<ValidationResponse> validations = new ArrayList <ValidationResponse>();
			for(FieldError error:fieldErrors) {
				ValidationResponse validation = new ValidationResponse();
				validation.setField1(error.getField());
				validation.setErrorMessage(error.getDefaultMessage());
				validation.add(validation);
			}
			response.setValidations(fieldErrors);
		}
		response.setMessge(exc.getMessage());
		return response;
		
	}
}
//return exc.getBr().getFieldErrors().get(0).getDefaultMessage();