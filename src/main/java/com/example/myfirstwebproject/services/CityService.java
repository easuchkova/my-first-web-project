package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.DTOs.CityDTO;
import com.example.myfirstwebproject.utilits.FindCity;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    public CityDTO findCity(String name) {
        return FindCity.findCity(name);
    }
}
