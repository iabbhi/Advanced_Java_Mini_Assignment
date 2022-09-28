package com.hashedin.validatorassignment.dtos;

import com.hashedin.validatorassignment.models.User;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

@Data
public class UserDto {

    @NotEmpty(message = "The full name is required.")
    @Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.")
    private String fullName;

    @NotEmpty(message = "The email address field is required.")
    @Email(message = "The field email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    private String email;

    @NotNull(message = "The date of birth field is required.")
    //@DateOfBirth(message = "The field date of birth must be greater or equal than 18")
    @Past(message = "The date of birth must be in the past.")
    private Date dateOfBirth;

    @NotEmpty(message = "The gender field is required.")
    private String gender;

    @NotNull(message = "The salary field is required.")
    @PositiveOrZero(message = "Salary must be greater than or equals to zero.")
    private String salary;

    public User toUser() {
        return new User()
                .setName(fullName)
                .setEmail(email.toLowerCase())
                .setBirthDate(dateOfBirth)
                .setGender(gender)
                .setSalary(salary);
    }
}
