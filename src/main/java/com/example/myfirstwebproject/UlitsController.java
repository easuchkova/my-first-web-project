package com.example.myfirstwebproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UlitsController {
    private final UtilsService service;

    @PostMapping("/addNumber")
    public void addNumber(@RequestParam int number) {
        service.addNumber(number);
    }

    @GetMapping("/isInList")
    public boolean isInList(@RequestParam int number) {
        return service.isInList(number);
    }

    @GetMapping("/findCity")
    public City findCity(@RequestParam String name){
        return service.findCity(name);
    }
}
