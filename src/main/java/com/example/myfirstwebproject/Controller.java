package com.example.myfirstwebproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Service service;

    @RequestMapping("/returnString")
    public String returnString() {
        return service.returnString();
    }
}
