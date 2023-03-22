package com.example.farmers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Farmers")
@Table(name = "farmer")
public class Farmer {
    @Id
    @SequenceGenerator(
            name = "farmers_sequence",
            sequenceName = "farmers_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "farmers_sequence"


    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;


    @Column(
            name = "farmers_first_name",
            updatable = true
    )
    private String farmers_first_name;


    @Column(
            name = "farmers_last_name",
            updatable = true
    )
    private String farmers_last_name;

    @Column(
            name = "email",
            updatable = true
    )
    private String email;

    @Column(
            name = "farmers_address",
            updatable = true
    )
    private String farmers_address;

    @Column(
            name = "farmers_location",
            updatable = true
    )
    private String farmers_location;

    @Column(
            name = "farmers_password",
            updatable = true
    )
    private String farmers_password;

    @Column(
            name = "farmers_role",
            updatable = false
    )
    private String farmers_role;

    @Column(
            name = "isActive",
            updatable = true


    )
    private  boolean isActive;


}
