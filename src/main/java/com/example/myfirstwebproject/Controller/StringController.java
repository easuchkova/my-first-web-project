package com.example.myfirstwebproject.Controller;

import com.example.myfirstwebproject.Service.StringService;
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
    public String chooseString(@RequestParam("number") int number) {
        return service.chooseString(number);
    }
}