package com.example.myfirstwebproject.utilits;

import java.util.*;

public class Utils {
    private static final List<Integer> NUMBERS = new ArrayList<>();

    public static String addNumber(int number) {
        NUMBERS.add(number);
        return "done";
    }

    public static boolean isInList(int number) {
        return NUMBERS.contains(number);
    }
}
