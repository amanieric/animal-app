package com.eisec.animal.dto;


import com.eisec.animal.entity.Animal;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;


@Getter
@Setter
public class AnimalDto extends ResponseAnimalDto {

    private String name;
    private BigDecimal price;
    private Boolean status;

    @Builder
    public AnimalDto(Integer id, String name, BigDecimal price, Boolean status) {
        super(id);
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public static AnimalDto fromEntity(Animal animal){
        if(animal==null){
            return null;
        }
        return AnimalDto.builder()
                .id(animal.getId())
                .price(animal.getPrice())
                .status(animal.getStatus())
                .status(animal.getStatus())
                .build();
    }

    public static Animal toEntity(AnimalDto animalDto){
        if(animalDto == null){
            return null;
        }
        Animal animal = new Animal();
        animal.setId(animalDto.getId());
        animal.setName(animalDto.getName());
        animal.setPrice(animalDto.getPrice());
        animal.setStatus(animalDto.getStatus());
        return animal;
    }
}
