package com.example.springmustachehospital.user.domain;


import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public class UserDto {
    Long id;
    String username;
    String password;


}
