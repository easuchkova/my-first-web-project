package com.example.myfirstwebproject.Utilits;

import java.io.File;
import java.io.IOException;
import java.util.*;

//контроллеры // сервисы // утилиты //city model либо dto cityDTO? //Utilits/Ulits
public class Utils {
    static List<Integer> numbers = new ArrayList<>();

    public static String addNumber(int number) {
        numbers.add(number);
        return "done";
    }

    public static boolean isInList(int number) {
        return numbers.contains(number);
    }
}
