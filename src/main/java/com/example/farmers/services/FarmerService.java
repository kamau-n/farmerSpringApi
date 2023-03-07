package com.example.farmers.services;

import com.example.farmers.models.Farmer;
import com.example.farmers.repositories.FarmersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FarmerService {
    private  final FarmersRepository farmersRepository;
    public List<Farmer> getFarmers() {
        return  farmersRepository.findAll();


    }


    public void setFarmer(Farmer farmer) {
        farmersRepository.save(farmer);
    }

    public List<Farmer> getFarmerById(Integer id) {
        System.out.println(id);

       return farmersRepository.findFarmerById(id);
    }
}
