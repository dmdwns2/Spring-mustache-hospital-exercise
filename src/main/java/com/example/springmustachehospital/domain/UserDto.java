package com.example.springmustachehospital.domain;


import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public class UserDto {
    Long id;
    String username;
    String password;


}
