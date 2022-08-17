package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.utilits.Utils;
import org.springframework.stereotype.Service;

@Service
public class ListNumberService {

    public String addNumber(int number) {
        return Utils.addNumber(number);
    }

    public boolean isInList(int number) {
        return Utils.isInList(number);
    }

}
