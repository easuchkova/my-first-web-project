package com.example.myfirstwebproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringService {

    public String returnString() {
        return "Hello world!";
    }

    public String chooseString(int number) {
        return "Это цифра: " + number;
    }

}