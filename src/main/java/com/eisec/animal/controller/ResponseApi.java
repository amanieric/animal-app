package com.eisec.animal.controller;

import com.eisec.animal.dto.ResponseAnimalDto;
import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.List;

@Builder
public class ResponseApi {

    private Integer httpCode;
    private String message;
    private List<ResponseAnimalDto> responseAnimalDtoList;
}
