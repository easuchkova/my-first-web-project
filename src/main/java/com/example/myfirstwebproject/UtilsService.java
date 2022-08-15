package com.example.myfirstwebproject;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class UtilsService {
    Utils numbers = new Utils();

    public String addNumber(int number) {
        return Utils.addNumber(number);
    }

    public boolean isInList(int number) {
        return Utils.isInList(number);
    }

    @SneakyThrows
    public City findCity(String name) {
        return Utils.findCity(name);
    }
}
