package com.example.farmers.controllers;

import com.example.farmers.models.Farmer;
import com.example.farmers.repositories.FarmersRepository;
import com.example.farmers.services.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/api/farmers")
public class FarmerController {

    private  final FarmerService farmerService;



    @GetMapping(path = "{farmersId}")
    public List<Farmer> getFarmerById(@PathVariable("farmersId") Integer id){
       return farmerService.getFarmerById(id);


    }



   @PostMapping
    public void registerFarmer(Farmer farmer){
            farmerService.setFarmer(farmer);
        }



}
