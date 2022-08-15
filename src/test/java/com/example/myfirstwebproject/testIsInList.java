package com.example.myfirstwebproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testIsInList {
    @Test
    public void testIsInList() {

        // given:
        UtilsService service = new UtilsService();
        int number = 3;

        // when:
        boolean actual = service.isInList(number);

        // then:
        Assertions.assertFalse(actual);
    }
}
