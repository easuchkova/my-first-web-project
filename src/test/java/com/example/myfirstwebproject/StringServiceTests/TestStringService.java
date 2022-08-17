package com.example.myfirstwebproject.StringServiceTests;

import com.example.myfirstwebproject.Service.StringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringService {

    StringService service = new StringService();

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
