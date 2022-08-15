package com.example.myfirstwebproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testChooseString {
    @Test
    public void testChooseString() {

        // given:
        StringService service = new StringService();
        int number = 3;

        // when:
        String actual = service.chooseString(number);
        String expected = "Это цифра: " + number;

        // then:
        Assertions.assertEquals(expected, actual);
    }

}
