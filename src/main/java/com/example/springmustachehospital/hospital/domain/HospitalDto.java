package com.example.springmustachehospital.hospital.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class HospitalDto {
    private Integer id;
    private String content;//roadNameAddress;
    private String title;
    private Integer patientRoomCount;
    private Integer totalNumberOfBeds;
    private Float totalAreaSize;
}
