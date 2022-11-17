package com.example.springmustachehospital.repository;

import com.example.springmustachehospital.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}