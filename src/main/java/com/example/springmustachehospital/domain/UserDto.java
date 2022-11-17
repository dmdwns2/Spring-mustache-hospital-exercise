package com.example.springmustachehospital.domain;


import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public class UserDto {
    Long id;
    String username;
    String password;

    public User toEntity(Long id, String username, String password) {
        return new User(
                this.id,
                this.username,
                this.password);

    }
}
