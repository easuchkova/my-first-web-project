package com.example.myfirstwebproject.Service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String returnString() {
        return "Hello world!";
    }

    public String chooseString(int number) {
        return "Это цифра: " + number;
    }

}