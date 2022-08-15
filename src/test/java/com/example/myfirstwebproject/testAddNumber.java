package com.example.myfirstwebproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testAddNumber {
    @Test
    public void testAddNumber() {

        // given:
        UtilsService service = new UtilsService();
        int number = 3;

        // when:
        String actual = service.addNumber(number);
        String expected = "done";

        // then:
        Assertions.assertEquals(expected, actual);
    }

}
