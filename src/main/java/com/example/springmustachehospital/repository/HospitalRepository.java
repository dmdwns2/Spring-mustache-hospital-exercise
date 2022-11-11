package com.example.springmustachehospital.repository;


import com.example.springmustachehospital.domain.Hospital;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    List<Hospital> findByTitleContaining(String keyword, Pageable pageable);

}
