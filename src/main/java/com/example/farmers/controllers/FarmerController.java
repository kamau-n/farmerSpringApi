package com.example.farmers.controllers;

import com.example.farmers.dto.FarmerDTO;
import com.example.farmers.models.Farmer;
import com.example.farmers.repositories.FarmersRepository;
import com.example.farmers.services.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/api/farmers")
public class FarmerController {

    @Autowired
    private FarmerService farmerService;


//    @GetMapping(path = "{farmersId}")
//    public List<Farmer> getFarmerById(@PathVariable("farmersId") Integer id){
//       return farmerService.getFarmerById(id);
//
//
//    }

    @GetMapping()
    public List<FarmerDTO> getFarmers() {
        return farmerService.getFarmer();

    }





//   @PostMapping
//    public void registerFarmer(Farmer farmer){
//            farmerService.setFarmer(farmer);
//        }
//
//
//
}
