package com.hashedin.validatorassignment.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class SalaryValidator implements ConstraintValidator<Salary,Double> {

    @Override
    public boolean isValid(Double salary, ConstraintValidatorContext constraintValidatorContext) {
        return salary>=0;
    }
}