package com.example.farmers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FarmerDTO {
private  int id;
private String farmers_first_name;
private String farmers_last_name;
private String email;

private String farmers_address;
private String farmers_location;




}
