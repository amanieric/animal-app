package com.eisec.animal.service;

import com.eisec.animal.dto.AnimalDto;
import com.eisec.animal.dto.ResponseAnimalDto;
import com.eisec.animal.entity.Animal;
import com.eisec.animal.repository.AnimalRepository;
import com.eisec.animal.service.interfaces.AnimalServiceInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnimalService implements AnimalServiceInterfaces {

    private final AnimalRepository animalRepository;

    @Override
    public AnimalDto createAnimal(AnimalDto animalDto) {
        return AnimalDto.fromEntity(animalRepository.save(AnimalDto.toEntity(animalDto)));
    }

    @Override
    public AnimalDto findByOne(Integer id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return Optional.of(AnimalDto.fromEntity(animal.get())).orElseThrow(
                ()->new RuntimeException("Attention animal introuvable")
        );
    }
}
