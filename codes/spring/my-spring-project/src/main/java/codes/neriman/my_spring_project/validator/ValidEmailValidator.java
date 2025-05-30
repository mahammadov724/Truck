package codes.neriman.my_spring_project.validator;

import codes.neriman.my_spring_project.dto.ValidEmail;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidEmailValidator implements ConstraintValidator<ValidEmail, String> {
    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.contains("@") && email.contains(".");
    }
}