package com.example.springmustachehospital.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
