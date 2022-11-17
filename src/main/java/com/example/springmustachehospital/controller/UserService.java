package com.example.springmustachehospital.controller;

import com.example.springmustachehospital.domain.User;
import com.example.springmustachehospital.domain.UserResponse;
import com.example.springmustachehospital.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUser(Long id) {
        Optional<User> optUser = userRepository.findById(id);
        if (optUser.isEmpty()) {
            return new UserResponse(id, "", "해당 id의 유저가 없습니다");
        } else {
            User user = optUser.get();
            return new UserResponse(user.getId(), user.getUsername(), "");
        }
    }
}