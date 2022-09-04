package com.example.myfirstwebproject.utilits;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static final List<Integer> NUMBERS = new ArrayList<>();

    public static boolean addNumber(int number) {
        return NUMBERS.add(number);
    }

    public static boolean isInList(int number) {
        return NUMBERS.contains(number);
    }
}
