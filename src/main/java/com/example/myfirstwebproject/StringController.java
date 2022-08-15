package com.example.myfirstwebproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public String chooseString(@RequestParam int number) {
        return service.chooseString(number);
    }
}