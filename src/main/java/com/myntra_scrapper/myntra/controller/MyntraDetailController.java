package com.myntra_scrapper.myntra.controller;


import com.myntra_scrapper.myntra.dto.MyntraDetailDAO;
import com.myntra_scrapper.myntra.entity.MyntraDetail;
import com.myntra_scrapper.myntra.repository.MyntraDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyntraDetailController {

    @Autowired
    private MyntraDetailRepository myntraDetailRepository;
    @CrossOrigin(origins = "*")
    @PostMapping("/myntra_details_create")
    public MyntraDetail createMyntraDetail(@RequestBody MyntraDetailDAO myntraDetailDAO) {
        MyntraDetail myntraDetail = new MyntraDetail();
        myntraDetail.setEmail(myntraDetailDAO.getEmail());
        myntraDetail.setMyntraUrl(myntraDetailDAO.getMyntraUrl());
        myntraDetail.setThresholdPrice(myntraDetailDAO.getThresholdPrice());

        return myntraDetailRepository.save(myntraDetail);
    }
    @GetMapping("/get_myntra_details")
    public List<MyntraDetail> getMyntraDetailsByEmail(@RequestParam String email) {
        return myntraDetailRepository.findByEmail(email);
    }
    @GetMapping("/get_myntra_details/all")
    public List<MyntraDetail> getUserDetails() {
        return myntraDetailRepository.findAll();
    }
}
