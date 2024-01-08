package com.eisec.animal.service.interfaces;

import com.eisec.animal.dto.AnimalDto;
import com.eisec.animal.dto.ResponseAnimalDto;
import com.eisec.animal.entity.Animal;

public interface AnimalServiceInterfaces {

    AnimalDto createAnimal(AnimalDto animalDto);
    AnimalDto findByOne(Integer id);
}
