package com.example.farmers.controllers;

import com.example.farmers.dto.FarmerDTO;
import com.example.farmers.models.Farmer;
import com.example.farmers.repositories.FarmersRepository;
import com.example.farmers.services.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/api/admin/farmers")
public class AdminController {

    private  final FarmerService farmerService;

//    public FarmerController(FarmerService farmerService) {
//        this.farmerService = farmerService;
//    }

    @GetMapping()
    public List<FarmerDTO> getFarmers(){
        return farmerService.getFarmers();

    }



//    @PostMapping
//    public void setFarmer(Farmer farmer){
//        farmerService.setFarmer(farmer);
//    }



}
