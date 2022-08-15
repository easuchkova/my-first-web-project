package com.example.myfirstwebproject;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Utils {
    static List<Integer> numbers = new ArrayList<>();

    public static String addNumber ( int number){
        numbers.add(number);
        return "done";
    }

    public static boolean isInList ( int number){
        return numbers.contains(number);
    }

    public static City findCity (String name) throws IOException {
        Map<String, City> cityMap = getDatabase();
        return cityMap.get(name);
    }


    public static Map<String, City> getDatabase() throws IOException {
        String fileName = "Задача ВС Java Сбер.csv";
        File file = new File(fileName);
        List<City> cities = new ArrayList<>();
        Map<String, City> mapCities = Collections.emptyMap();

        try (Scanner inputScream = new Scanner(file)) {
            inputScream.useDelimiter(System.getProperty("line.separator"));
            while (inputScream.hasNextLine()) {
                City city = parseCSVLine(inputScream.nextLine());
//                cities.add(city);
                mapCities.put(city.name.toUpperCase(Locale.ROOT), city);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapCities;
    }



    private static City parseCSVLine (String line){
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(";");

        int id = scanner.nextInt();
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population = scanner.nextInt();
        String foundation;

        if (scanner.hasNext())
            foundation = scanner.next();
        else
            foundation = "";

        return new City(id, name, region, district, population, foundation);
    }
}
