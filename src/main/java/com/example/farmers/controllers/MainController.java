package com.example.farmers.controllers;


import com.example.farmers.models.Farmer;
import com.example.farmers.services.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class MainController {

    FarmerService farmerService;

    @GetMapping
    public  String getMain(){
        return "this is the main route";
    }
//@PostMapping
//    public  void addFarmer(Farmer farmer){
//        farmerService.setFarmer(farmer);
//}
}
