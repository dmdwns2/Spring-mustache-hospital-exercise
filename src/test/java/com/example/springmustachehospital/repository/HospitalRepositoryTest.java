//package com.example.springmustachehospital.repository;
//
//import com.example.springmustachehospital.domain.Hospital;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//class HospitalRepositoryTest {
//
//    @Autowired
//    HospitalRepository hospitalRepository;
//
//    @Test
//    @DisplayName("BusinessTypeName이 보건소 보건지소 보건진료소인 데이터가 잘 나오는지")
//    void findByBusinessTypeIn() {
//        List<String> inClues = new ArrayList<>();
//        inClues.add("보건소");
//        inClues.add("보건지소");
//        inClues.add("보건진료소");
//        List<Hospital> hospitals = hospitalRepository.findByBusinessTypeNameIn(inClues);
//        for (var hospital:
//             hospitals ) {
//            System.out.println(hospital.getHospitalName());
//        }
//    }
//
//
//    @Test
//    void containing() {
//        List<Hospital> hospitals = hospitalRepository.findByRoadNameAddressContaining("송파구");
//        printHospitalNameAndAddress(hospitals);
//    }
//
//
//
//    @Test
//    void startsWith() {
//        List<Hospital> hospitals = hospitalRepository.findByRoadNameAddressStartsWith("경희");// 가톨릭 서울 연세 경희
//        printHospitalNameAndAddress(hospitals);
//    }
//
//
//    @Test
//    void name() {
//        Optional<Hospital> hospital = hospitalRepository.findById(1);
//        Hospital hp = hospital.get();
//        System.out.println(hp.getId());
//        assertEquals(1, hp.getId());
//    }
//
//
//    void printHospitalNameAndAddress(List<Hospital> hospitals) {
//        for (var hospital : hospitals) {
//            System.out.printf("%s | %s %f\n", hospital.getHospitalName(), hospital.getRoadNameAddress(), hospital.getTotalAreaSize());
//        }
//
//        System.out.println(hospitals.size());
//    }
//}