package com.PrimeNumber.ValidPassword.PrimeNumberValidPass.Annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PrimeNumberValidator implements ConstraintValidator<PrimeNumber,Integer> {

    @Override
    public boolean isValid(Integer number, ConstraintValidatorContext context){
        if(number==null || number<2) return false;
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0) return false;
        }
        return true;
    }
}
