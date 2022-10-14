package com.example.myfirstwebproject.StringServiceTests;

import com.example.myfirstwebproject.services.StringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestStringService {
    @Autowired
    StringService service;

    @Test
    public void testReturnString() {
        // given:

        // when:
        String actual = service.returnString();
        String expected = "Hello world!";

        // then:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChooseString() {

        // given:

        int number = 3;

        // when:
        String actual = service.chooseString(number);
        String expected = "Это цифра: " + number;

        // then:
        Assertions.assertEquals(expected, actual);
    }
}
