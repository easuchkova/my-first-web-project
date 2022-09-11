package com.example.myfirstwebproject.PersonServiceTests;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import com.example.myfirstwebproject.services.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PersonServiceTest {

    @Autowired
    private PersonService service;

    @Test
    public void findById() {
        int id = 1;

        PersonDTO actual = service.findById(id);
        PersonDTO expected = new PersonDTO(1, "Tom", 20, true);

        Assertions.assertEquals(expected, actual);
    }

}