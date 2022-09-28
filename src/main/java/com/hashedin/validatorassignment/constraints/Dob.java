package com.hashedin.validatorassignment.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = DobValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented

public @interface Dob {
        String message() default "Message coming from Validator Annotation";
        Class <?> [] groups() default {};
        Class <? extends Payload> [] payload() default {};
}
