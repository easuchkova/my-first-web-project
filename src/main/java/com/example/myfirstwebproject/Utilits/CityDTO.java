package com.example.myfirstwebproject.Utilits;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;


import java.io.File;
import java.io.IOException;
import java.util.*;

@Slf4j
@Data
@AllArgsConstructor
public class CityDTO {
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    static Map<String, CityDTO> cityMap = getFromCsvFile();

    public static CityDTO findCity(String name) throws IOException {
        return cityMap.get(name.toUpperCase());
    }


    public static Map<String, CityDTO> getFromCsvFile() {
        String fileName = "Задача ВС Java Сбер.csv";
        File file = new File(fileName);
        Map<String, CityDTO> mapCities = new HashMap<>();

        try (Scanner inputScream = new Scanner(file)) {
            inputScream.useDelimiter(System.getProperty("line.separator"));
            while (inputScream.hasNextLine()) {
                CityDTO city = parseCSVLine(inputScream.nextLine());
                mapCities.put(city.getName().toUpperCase(), city);
            }
        } catch (IOException er) {
            log.error(String.valueOf(er));
        }
        return mapCities;
    }


    private static CityDTO parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(";");

        int id = scanner.nextInt();
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population = scanner.nextInt();
        String foundation;

        if (scanner.hasNext()) foundation = scanner.next();
        else foundation = "";

        return new CityDTO(id, name, region, district, population, foundation);
    }
}

