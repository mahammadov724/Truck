package codes.neriman.my_spring_project.handler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import codes.neriman.my_spring_project.exception.OurRunTimeException;
import codes.neriman.my_spring_project.responce.ExceptionResponce;
import codes.neriman.my_spring_project.responce.ValidationResponse;

import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandlers {

    @ExceptionHandler(OurRunTimeException.class) 
    @ResponseStatus(code = HttpStatus.BAD_REQUEST) 
    public ExceptionResponce handle(OurRunTimeException exc) {
        ExceptionResponce response = new ExceptionResponce();
        
        BindingResult br = exc.getBr();
        
        if (br == null) {
            response.setValidations(null); 
        } else {
            List<FieldError> fieldErrors = br.getFieldErrors();
            List<ValidationResponse> validations = new ArrayList<>();
            
            for (FieldError fieldError : fieldErrors) {
                ValidationResponse validation = new ValidationResponse();
                validation.setField(fieldError.getField());
                validation.setErrorMessage(fieldError.getDefaultMessage()); 
                validations.add(validation); 
            }
            
            response.setValidations(validations); 
        }

        response.setMessage(exc.getMessage());
        return response;
    }
}
