package com.example.farmers;

import com.example.farmers.repositories.FarmersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = FarmersRepository.class)
public class FarmersEcomerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmersEcomerceApplication.class, args);
	}

}
