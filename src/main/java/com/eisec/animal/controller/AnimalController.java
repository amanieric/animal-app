package com.eisec.animal.controller;

import com.eisec.animal.controller.api.AnimalControllerInterface;
import com.eisec.animal.dto.AnimalDto;
import com.eisec.animal.dto.ResponseAnimalDto;
import com.eisec.animal.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnimalController implements AnimalControllerInterface {

    private final AnimalService animalService;

    @Override
    public ResponseEntity<ResponseApi> createAnimal(AnimalDto animalDto) {
        List<ResponseAnimalDto> result = new ArrayList<>();
        ResponseAnimalDto response = animalService.createAnimal(animalDto);
        result.add(response);
        ResponseApi respnseApi = ResponseApi.builder()
                .httpCode(HttpStatus.CREATED.value())
                .message("Creation de l'animal")
                .responseAnimalDtoList(result)
                .build();

        return ResponseEntity.ok(respnseApi);
    }

    @Override
    public ResponseEntity<ResponseApi> findByOne(Integer id) {
        List<ResponseAnimalDto> result = new ArrayList<>();
        ResponseAnimalDto response = animalService.findByOne(id);
        result.add(response);
        ResponseApi responseApi = ResponseApi.builder()
                .httpCode(HttpStatus.ACCEPTED.value())
                .message("Reception de l'animal")
                .responseAnimalDtoList(result)
                .build();
        return ResponseEntity.ok(responseApi);
    }
}
