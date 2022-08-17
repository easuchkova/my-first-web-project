package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.services.ListNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ListNumberController {
    private final ListNumberService service;

    @PostMapping("/addNumber")
    public void addNumber(@RequestParam int number) {
        service.addNumber(number);
    }

    @GetMapping("/isInList")
    public boolean isInList(@RequestParam int number) {
        return service.isInList(number);
    }


}
