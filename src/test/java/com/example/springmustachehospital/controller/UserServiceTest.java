package com.example.springmustachehospital.controller;

import com.example.springmustachehospital.user.controller.UserService;
import com.example.springmustachehospital.user.domain.User;
import com.example.springmustachehospital.user.domain.UserRequest;
import com.example.springmustachehospital.user.domain.UserResponse;
import com.example.springmustachehospital.user.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class UserServiceTest {
    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService(userRepository);  // 수동 DI
    }

    @Test
    @DisplayName("회원 등록 성공 메세지가 나오는지")
    void addTest() {

        Mockito.when(userRepository.save(any()))
                .thenReturn(new User(1l, "ejkim", "1234"));

        UserResponse userResponse = userService.addUser(new UserRequest("ejkim", "1234"));
        assertEquals("ejkim", userResponse.getUsername());
        assertEquals("등록이 완료되었습니다.", userResponse.getMessage());
    }
}