package com.example.springmustachehospital.controller;

import com.example.springmustachehospital.domain.Hospital;
import com.example.springmustachehospital.repository.HospitalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/hospitals")
@Slf4j
public class HospitalController {
    private final HospitalRepository hospitalRepository;
//    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalRepository hospitalRepository) {
//    public HospitalController(HospitalRepository hospitalRepository, HospitalService hospitalService) {
        this.hospitalRepository = hospitalRepository;
//        this.hospitalService = hospitalService;
    }

//    @GetMapping("")
//    public String list(Model model, Pageable pageable) {
//        Page<Hospital> hospitals = hospitalRepository.findAll(pageable);
//        log.info("size:{}", hospitals.getSize());
//        model.addAttribute("hospitals", hospitals);
//        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
//        model.addAttribute("next", pageable.next().getPageNumber());
//        return "hospital/list";
//    }

    @GetMapping("")
    public String list(@RequestParam String keyword, Pageable pageable, Model model) {
        // keyword는 어떻게 받을 것인가?
        log.info("keyword:{}", keyword);
        Page<Hospital> hospitals = hospitalRepository.findByRoadNameAddressContaining(keyword, pageable);
        model.addAttribute("hospitals", hospitals);
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        return "hospital/list";
    }

//    @GetMapping("")
//    public String list(Model model, @PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
//        log.info(String.valueOf(pageable.getPageNumber()));
//        model.addAttribute("hospitals", hospitalService.getHospitalList(pageable));
//        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
//        model.addAttribute("next", pageable.next().getPageNumber());
//        return "hospital/list";
//    }

//    @GetMapping("/search")
//    public String search(String keyword, @PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable , Model model) {
//        List<Hospital> searchList =  hospitalRepository.findByTitleContaining(keyword, pageable);
//        model.addAttribute("searchList", searchList);
//        return "searchPage";
//    }
}
