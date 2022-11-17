package com.example.springmustachehospital.domain;

public class UserRequest {
    private String username;
    private String password;


    public User toEntity() {
        return User.builder()
                .username(this.username)
                .password(this.password)
                .build();
    }
}
