package com.example.myfirstwebproject;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String returnString () {
        return "Hello world!";
    }
}
