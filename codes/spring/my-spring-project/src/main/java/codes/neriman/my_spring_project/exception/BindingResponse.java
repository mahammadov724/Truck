package codes.neriman.my_spring_project.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class BindingResponse {
	private List<String> errors = new ArrayList<>();

    public void addErrors(BindingResult bindingResult) {
        for (FieldError error : bindingResult.getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }
    }
}
