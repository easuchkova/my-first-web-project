package com.example.myfirstwebproject.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityDTO {
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;
}

