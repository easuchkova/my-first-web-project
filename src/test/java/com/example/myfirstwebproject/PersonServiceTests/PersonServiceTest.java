package com.example.myfirstwebproject.PersonServiceTests;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import com.example.myfirstwebproject.repository.PersonRepository;
import com.example.myfirstwebproject.services.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.mockito.BDDMockito.given;

@SpringBootTest
class PersonServiceTest {

    @Mock
    private PersonRepository repository;

    @Autowired
    private PersonService service;
    public PersonServiceTest () {
        this.service = new PersonService(repository);
    }

    @Test
    public void findById() {
        given(repository.findById(1)).willReturn(new PersonDTO(1, "Tom", 20, true));

        PersonDTO actual = service.findById(1);
        PersonDTO expected = new PersonDTO(1, "Tom", 20, true);

        Assertions.assertEquals(expected, actual);
    }
}
