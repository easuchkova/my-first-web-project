package com.example.myfirstwebproject.CityTests;

import com.example.myfirstwebproject.services.CityService;
import com.example.myfirstwebproject.DTOs.CityDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCityService {

    @Autowired
    private static CityService service;

    @Test
    public void testFindCity() {

        // given:
        String name = "москва";

        // when:
        CityDTO actual = service.findCity(name);
        CityDTO expected = new CityDTO(490, "Москва", "Москва", "Центральный", 11514330, "1147");

        // then:
        Assertions.assertEquals(expected, actual);
    }
}
