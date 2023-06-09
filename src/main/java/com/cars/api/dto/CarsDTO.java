package com.cars.api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarsDTO(

        @NotBlank
        String modelo,

        @NotBlank
        String fabricante,

        @Past
        Date dataFabricacao,
        
        @NotNull
        Double valor,

        @NotNull
        int anoModelo) {

}