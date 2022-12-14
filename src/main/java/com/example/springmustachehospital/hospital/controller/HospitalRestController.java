package com.example.springmustachehospital.hospital.controller;

import com.example.springmustachehospital.hospital.domain.HospitalResponse;
import com.example.springmustachehospital.hospital.domain.Review;
import com.example.springmustachehospital.hospital.service.HospitalService;
import com.example.springmustachehospital.hospital.service.ReviewService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalRestController {

    private final HospitalService hospitalService;
    private final ReviewService reviewService;

    public HospitalRestController(HospitalService hospitalService, ReviewService reviewService) {
        this.hospitalService = hospitalService;
        this.reviewService = reviewService;
    }
    //    @GetMapping("")
//    public ResponseEntity<HospitalResponse> list(Pageable pageable){
//        return ResponseEntity.ok().body(hospitalService.findHospital(pageable));
//    }


    @GetMapping("/{id}")
    public ResponseEntity<HospitalResponse> get(@PathVariable Integer id) { // ResponseEntity도 DTO타입
        HospitalResponse hospitalResponse = hospitalService.getHospital(id); // DTO
        return ResponseEntity.ok().body(hospitalResponse); // Return은 DTO로
    }

    @GetMapping("/{id}/reviews")
    public ResponseEntity<Page<Review>> getReviews(@PathVariable Integer hospitalId) {
        Pageable pageable = Pageable.ofSize(20);
        return ResponseEntity.ok().body(reviewService.get(hospitalId, pageable));
    }
}