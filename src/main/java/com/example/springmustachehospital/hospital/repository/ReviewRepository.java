package com.example.springmustachehospital.hospital.repository;

import com.example.springmustachehospital.hospital.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
