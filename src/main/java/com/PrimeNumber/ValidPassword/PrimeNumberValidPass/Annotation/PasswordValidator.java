package com.PrimeNumber.ValidPassword.PrimeNumberValidPass.Annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword,String> {
    private static final String PASSWORD_PATTERN="^(?=.[A-Z])(?=.[a-z])(?=.*[@#$%^&+=!]).{10,}$";
    @Override
    public void initialize(ValidPassword constraintAnnotation) {
    }
    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            return false; // Password cannot be null
        }
        return password.matches(PASSWORD_PATTERN);
    }
}