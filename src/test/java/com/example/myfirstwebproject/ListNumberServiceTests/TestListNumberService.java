package com.example.myfirstwebproject.ListNumberServiceTests;

import com.example.myfirstwebproject.services.ListNumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestListNumberService {

    @Autowired
    private static ListNumberService service;

    @Test
    public void testAddNumber() {

        // given:
        int number = 3;

        // when:
        String actual = service.addNumber(number);
        String expected = "done";

        // then:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsInList() {

        // given:
        int number = 3;

        // when:
        boolean actual = service.isInList(number);

        // then:
        Assertions.assertFalse(actual);
    }
}
