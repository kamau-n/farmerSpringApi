package com.example.farmers.repositories;

import com.example.farmers.models.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FarmersRepository  extends JpaRepository<Farmer,Integer> {

    List<Farmer> findFarmerById(Integer integer);
    Optional<Farmer> findFarmerByEmail(String farmers_email);



}
