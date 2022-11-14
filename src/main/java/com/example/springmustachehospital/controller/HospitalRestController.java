package com.example.springmustachehospital.controller;

import com.example.springmustachehospital.domain.Hospital;
import com.example.springmustachehospital.domain.HospitalResponse;
import com.example.springmustachehospital.repository.HospitalRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalRestController {

    private final HospitalRepository hospitalRepository;

    public HospitalRestController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HospitalResponse> get(@PathVariable Integer id) {
        Optional<Hospital> hospital = hospitalRepository.findById(id);
        return ResponseEntity.ok().body(Hospital.of(hospital.get()));
    }
}
