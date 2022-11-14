//package com.example.springmustachehospital.controller;
//
//import com.example.springmustachehospital.domain.Hospital;
//import com.example.springmustachehospital.repository.HospitalRepository;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class HospitalService {
//
//    HospitalRepository hospitalRepository;
//
//    public HospitalService(HospitalRepository hospitalRepository) {
//        this.hospitalRepository = hospitalRepository;
//    }
//
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
//}
