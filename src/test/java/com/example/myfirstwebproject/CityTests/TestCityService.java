package com.example.myfirstwebproject.CityTests;

import com.example.myfirstwebproject.Service.CityService;
import com.example.myfirstwebproject.Utilits.CityDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCityService {
    static CityService service = new CityService();

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
