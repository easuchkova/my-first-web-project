package com.example.myfirstwebproject.utilits;

import java.util.*;

public class Utils {
    private static List<Integer> numbers = new ArrayList<>();

    public static String addNumber(int number) {
        numbers.add(number);
        return "done";
    }

    public static boolean isInList(int number) {
        return numbers.contains(number);
    }
}
