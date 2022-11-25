package com.example.springmustachehospital.hospital.service;

import com.example.springmustachehospital.hospital.repository.HospitalRepository;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
    private HospitalRepository hospitalRepository;

    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

}
