package com.example.farmers.services;

import com.example.farmers.config.auth.FarmerDetails;
import com.example.farmers.models.Farmer;
import com.example.farmers.repositories.FarmersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FarmerService implements UserDetailsService {

    @Autowired
     FarmersRepository farmersRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Optional<Farmer> farmer =  farmersRepository.findByEmail(email);
       farmer.orElseThrow(()-> new UsernameNotFoundException("User not found"));
        System.out.println(farmer);
         return  farmer.map(FarmerDetails::new).get();

    }

    public List<Farmer> getFarmers() {
        return  farmersRepository.findAll();


    }


    public void setFarmer(Farmer farmer) {
        System.out.println(farmer);
        farmersRepository.save(farmer);
    }

    public List<Farmer> getFarmerById(Integer id) {
        System.out.println(id);

       return farmersRepository.findFarmerById(id);
    }

    public List<Farmer> getFarmer() {
        return  farmersRepository.findAll();
    }
}
