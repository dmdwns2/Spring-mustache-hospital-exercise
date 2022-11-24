package com.example.springmustachehospital.hospital.service;

import com.example.springmustachehospital.hospital.domain.Hospital;
import com.example.springmustachehospital.hospital.domain.Review;
import com.example.springmustachehospital.hospital.domain.ReviewCreateRequest;
import com.example.springmustachehospital.hospital.domain.ReviewCreateResponse;
import com.example.springmustachehospital.hospital.repository.HospitalRepository;
import com.example.springmustachehospital.hospital.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    public ReviewService(ReviewRepository reviewRepository, HospitalRepository hospitalRepository) {
        this.reviewRepository = reviewRepository;
        this.hospitalRepository = hospitalRepository;
    }

    public ReviewCreateResponse add(ReviewCreateRequest reviewCreateRequest) {
        Optional<Hospital> hospital = hospitalRepository.findById(reviewCreateRequest.getHospitalId());
        Review review = Review.builder()
                .title(reviewCreateRequest.getTitle())
                .content(reviewCreateRequest.getContent())
                .userName(reviewCreateRequest.getUserName())
                .hospital(hospital.get())
                .build();
        Review savedReview = reviewRepository.save(review);
        return new ReviewCreateResponse(savedReview.getId(), savedReview.getTitle(), savedReview.getContent(), savedReview.getContent(),
                "리뷰 등록이 성공 했습니다.");
    }

    public void create(ReviewCreateRequest dto) {
// hospitalId를 받아서 Hospital을 select함
        Optional<Hospital> optionalHospital = hospitalRepository.findById(dto.getHospitalId());
        Review savedReview = reviewRepository.save(Review.of(
                optionalHospital.orElseThrow(() -> new IllegalArgumentException("해당 hospitalId에 해당하는 병원이 없습니다.")),
                        dto.getTitle(), dto.getContent(), dto.getUserName()));
    }
}