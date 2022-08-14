package com.example.myfirstwebproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    private final StringService service = new StringService();

    @GetMapping("/returnString")
    public String returnString() {
        return service.returnString();
    }
}
