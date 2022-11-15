package com.example.springmustachehospital.controller;

import com.example.springmustachehospital.domain.HospitalResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(HospitalRestController.class)
class HospitalRestControllerTest {

    @Autowired
    MockMvc mockMvc; // 목빈을 사용하겠다.

    @MockBean
    HospitalService hospitalService;

    @Test
    @DisplayName("1개의 Json형태로 Response가 잘 오는지")
        // 비즈니스로직(Service를 검증하지 않음) , Controller만 검증
    void jsonResponse() {
        HospitalResponse hospitalResponse = HospitalResponse.builder()
                .id(2321)
                .roadNameAddress("서울특별시 서초구 서초중앙로 230, 202호 (반포동, 동화반포프라자빌딩)")
                .hospitalName("노소아청소년과의원")
                .patientRoomCount(0)
                .totalNumberOfBeds(0)
                .businessTypeName("의원")
                .totalAreaSize(0.0f)
                .businessStatusName("영업중")
                .build();
        given(hospitalService.getHospital(2321));

    }
}