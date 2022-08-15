package com.example.myfirstwebproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testReturnString {
    @Test
    public void testReturnString() {

        // given:
        StringService service = new StringService();

        // when:
        String actual = service.returnString();
        String expected = "Hello world!";

        // then:
        Assertions.assertEquals(expected, actual);
    }
}
