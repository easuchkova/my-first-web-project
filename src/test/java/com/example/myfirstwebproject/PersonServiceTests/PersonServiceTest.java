package com.example.myfirstwebproject.PersonServiceTests;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import com.example.myfirstwebproject.Exceptions.WebProjectException;
import com.example.myfirstwebproject.repository.PersonRepository;
import com.example.myfirstwebproject.services.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.*;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@SpringBootTest
class PersonServiceTest {

    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private PersonService service;

    @Test
    void findById() {
        when(personRepository.findById(1)).thenReturn(
                new PersonDTO(1, "Tom", 20, true));

        PersonDTO actual = service.findById(1);
        PersonDTO expected = new PersonDTO(1, "Tom", 20, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showAllPeople() {
        when(personRepository.showAllPeople()).thenReturn(
                Arrays.asList(new PersonDTO(1, "Tom", 20, true),
                        new PersonDTO(2, "Tim", 21, false),
                        new PersonDTO(3, "Anya", 10, true),
                        new PersonDTO(4, "Toma", 15, false)));

        List <PersonDTO> actual = service.showAllPeople();
        List <PersonDTO> expected = Arrays.asList(new PersonDTO(1, "Tom", 20, true),
                new PersonDTO(2, "Tim", 21, false),
                new PersonDTO(3, "Anya", 10, true),
                new PersonDTO(4, "Toma", 15, false));

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void addPerson() throws WebProjectException {
        given(personRepository.addPerson(new PersonDTO(1, "Nina", -3, false))).willReturn(true);
        given(personRepository.addPerson(null)).willReturn(true);
        given(personRepository.addPerson(new PersonDTO(1, "Nina", 3, false))).willReturn(true);

        Assertions.assertThrows(WebProjectException.class, () -> {
            service.addPerson(null);
        });

//        Assertions.assertThrows(WebProjectException.class, () -> {
//            service.addPerson(new PersonDTO(1, "Nina", -3, false));
//        });

        Assertions.assertTrue(service.addPerson(new PersonDTO(1, "Nina", 3, false)));
    }

    @Test
    void deletePerson() {
        given(personRepository.deletePerson(1)).willReturn(true);

        Assertions.assertTrue(service.deletePerson(1));
    }
}
