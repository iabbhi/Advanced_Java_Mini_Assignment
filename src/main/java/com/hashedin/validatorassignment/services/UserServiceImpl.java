package com.hashedin.validatorassignment.services;


import com.hashedin.validatorassignment.models.User;
import com.hashedin.validatorassignment.repositories.UserRepository;
import com.hashedin.validatorassignment.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }
}