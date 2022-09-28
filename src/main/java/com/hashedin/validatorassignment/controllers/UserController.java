package com.hashedin.validatorassignment.controllers;

import com.hashedin.validatorassignment.dtos.UserDto;
import com.hashedin.validatorassignment.models.User;
import com.hashedin.validatorassignment.services.interfaces.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody UserDto userDto) {
        User createdUser = userService.create(userDto.toUser());

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> allUsers() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}