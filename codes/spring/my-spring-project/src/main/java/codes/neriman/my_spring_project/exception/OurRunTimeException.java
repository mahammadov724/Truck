package codes.neriman.my_spring_project.exception;

import org.springframework.validation.BindingResult;

public class OurRunTimeException extends RuntimeException {

    private BindingResult bindingResult;

    public OurRunTimeException(BindingResult bindingResult, String message) {
        super(message);
        this.bindingResult = bindingResult;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }
}
