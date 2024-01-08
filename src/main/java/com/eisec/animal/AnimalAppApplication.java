package com.eisec.animal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AnimalAppApplication {

	public static void main(String[] args) {
		log.info("it's an integration continue CI/CI");
		SpringApplication.run(AnimalAppApplication.class, args);
	}

}
