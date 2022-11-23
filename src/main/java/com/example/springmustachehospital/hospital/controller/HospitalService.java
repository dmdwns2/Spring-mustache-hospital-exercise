package com.example.springmustachehospital.hospital.controller;

import com.example.springmustachehospital.hospital.domain.Hospital;
import com.example.springmustachehospital.hospital.domain.HospitalResponse;
import com.example.springmustachehospital.hospital.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public HospitalResponse getHospital(Integer id) {
        Optional<Hospital> optHospital = hospitalRepository.findById(id); // Entity
        Hospital hospital = optHospital.get();
        HospitalResponse hospitalResponse = Hospital.of(hospital); // DTO
        if (hospital.getBusinessStatusCode() == 13) {
            hospitalResponse.setBusinessStatusName("영업중");
        } else if (hospital.getBusinessStatusCode() == 3) {
            hospitalResponse.setBusinessStatusName("폐업");
        } else {
            hospitalResponse.setBusinessStatusName(String.valueOf(hospital.getBusinessStatusCode()));
        }
        return hospitalResponse;
    }
}
//    // 검색기능
//    @Transactional
//    public List<Hospital> search(String keyword, Pageable pageable) {
//
//        List<Hospital> hospitalList = hospitalRepository.findByTitleContaining(keyword, pageable);
//
//        return hospitalList;
//    }
//
//    // 페이징처리
//    @Transactional
//    public Page<Hospital> getHospitalList(Pageable pageable) {
//        return hospitalRepository.findAll(pageable);
//    }