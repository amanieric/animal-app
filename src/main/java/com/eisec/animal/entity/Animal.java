package com.eisec.animal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal extends AbstractEntity{

    private String name;

    private BigDecimal price;

    private Boolean status;

}
