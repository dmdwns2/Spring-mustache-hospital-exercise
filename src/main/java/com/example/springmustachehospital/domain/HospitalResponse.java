package com.example.springmustachehospital.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class HospitalResponse {
    private Integer id;
    private String roadNameAddress;
    private String hospitalName;
    private Integer patientRoomCount;
    private Integer totalNumberOfBeds;
    private String businessTypeName;
    private Float totalAreaSize;

}
