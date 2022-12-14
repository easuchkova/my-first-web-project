package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.services.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StringController {

    private final StringService service;

    @GetMapping("/returnString")
    public String returnString() {
        return service.returnString();
    }

    @GetMapping("/chooseString")
    @ResponseBody
    public String chooseString(@RequestParam("number") int number) {
        return service.chooseString(number);
    }
}