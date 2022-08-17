package com.example.myfirstwebproject.Service;

import com.example.myfirstwebproject.Utilits.CityDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @SneakyThrows
    public CityDTO findCity(String name) {
        return CityDTO.findCity(name);
    }
}
