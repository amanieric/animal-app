package com.eisec.animal.controller.api;

import com.eisec.animal.controller.ResponseApi;
import com.eisec.animal.dto.AnimalDto;
import com.eisec.animal.dto.ResponseAnimalDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface AnimalControllerInterface {

    @PostMapping(value = "/animal")
    ResponseEntity<ResponseApi> createAnimal(AnimalDto animalDto);

    @GetMapping(value = "/anaimal/{id}")
    ResponseEntity<ResponseApi> findByOne(Integer id);
}
