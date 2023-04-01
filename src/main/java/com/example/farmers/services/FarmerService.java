package com.example.farmers.services;

import com.example.farmers.config.auth.FarmerDetails;
import com.example.farmers.dto.FarmerDTO;
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
import java.util.stream.Collectors;

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

    public List<FarmerDTO> getFarmer() {
        return  farmersRepository.findAll()
                .stream()
                .map(this :: convertToDto)
                .collect(Collectors.toList());


    }

    public FarmerDTO convertToDto(Farmer farmer) {
        FarmerDTO farmerDTO = new FarmerDTO();
        farmerDTO.setId(farmer.getId());
        farmerDTO.setEmail(farmer.getEmail());
        farmerDTO.setFarmers_first_name(farmer.getFarmers_first_name());
        farmerDTO.setFarmers_last_name(farmer.getFarmers_last_name());
        farmerDTO.setFarmers_address(farmer.getFarmers_address());
        farmerDTO.setFarmers_location(farmer.getFarmers_location());

        return farmerDTO;
    }


//    public void setFarmer(Farmer farmer) {
//        System.out.println(farmer);
//        farmersRepository.save(farmer);
//    }

//    public List<Farmer> getFarmerById(Integer id) {
//        System.out.println(id);
//
//       return farmersRepository.findFarmerById(id);
//    }

//    public List<FarmerDTO> getFarmer() {
//        return  farmersRepository.findAll();
//    }
}
