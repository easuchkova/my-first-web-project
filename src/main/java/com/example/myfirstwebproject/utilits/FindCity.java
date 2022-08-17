package com.example.myfirstwebproject.utilits;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.example.myfirstwebproject.DTOs.CityDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FindCity {

    static Map<String, CityDTO> cityMap = getFromCsvFile();

    public static CityDTO findCity(String name) {
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
            log.error("Cannot find or scan file", er);
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

        if (scanner.hasNext()) {
            foundation = scanner.next();
        } else {
            foundation = "";
        }
        return new CityDTO(id, name, region, district, population, foundation);
    }
}
