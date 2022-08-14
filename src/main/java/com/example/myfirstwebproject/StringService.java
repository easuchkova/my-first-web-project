package com.example.myfirstwebproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringService {

    List<Integer> numbers = new ArrayList<>();

    public String returnString() {
        return "Hello world!";
    }

    public String chooseString(int number) {
        return "Это цифра: " + number;
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public boolean isInList(int number) {
        return numbers.contains(number);
    }

}