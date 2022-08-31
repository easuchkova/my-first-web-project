package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.DTOs.Person;
import com.example.myfirstwebproject.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping("/person")
    public List<Person> showALlPeople() {
        return service.showAllPeople();
    }

    @GetMapping("/person/find")
    public Person findById(@RequestParam int id) {
        return service.findById(id);
    }

    @GetMapping("/person/add")
    public void addPerson(@RequestParam String name, int age, Boolean hasPet) {
        Person person = new Person(); // ругается без создания

        person.setName(name);
        person.setAge(age);
        person.setHasPet(hasPet);

        service.addPerson(person);
    }
}
