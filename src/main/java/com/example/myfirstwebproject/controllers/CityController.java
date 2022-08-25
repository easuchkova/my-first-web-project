package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.DTOs.CityDTO;
import com.example.myfirstwebproject.services.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService service;

    @GetMapping("/findCity")
    public CityDTO findCity(@RequestParam String name) {
        return service.findCity(name);
    }
}
