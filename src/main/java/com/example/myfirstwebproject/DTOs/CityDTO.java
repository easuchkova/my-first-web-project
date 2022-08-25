package com.example.myfirstwebproject.DTOs;

import lombok.Data;

@Data
public class CityDTO {
    private final int id;
    private final String name;
    private final String region;
    private final String district;
    private final int population;
    private final String foundation;
}

