package com.example.myfirstwebproject.Service;

import com.example.myfirstwebproject.Utilits.Utils;
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
