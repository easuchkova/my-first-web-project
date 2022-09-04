package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import com.example.myfirstwebproject.IncorrectAgeException;
import com.example.myfirstwebproject.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping("/person")
    public List<PersonDTO> showALlPeople() {
        return service.showAllPeople();
    }

    @GetMapping("/person/find")
    public PersonDTO findById(@RequestParam int id) {
        return service.findById(id);
    }

    @PostMapping("/person/add")
    public void addPerson(@RequestParam PersonDTO person) throws IncorrectAgeException {
        service.addPerson(person);
    }
}
