package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.models.Person;
import com.example.myfirstwebproject.services.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService service;

    @GetMapping("/people")
    public List<Person> showALlPeople() {
        return service.showAllPeople();
    }

    @GetMapping("/people/find")
    public Person findById(@RequestParam int id) {
        return service.findById(id);
    }
}
