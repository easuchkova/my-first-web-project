package com.example.myfirstwebproject.Controller;

import com.example.myfirstwebproject.Service.CityService;
import com.example.myfirstwebproject.Utilits.CityDTO;
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
