package com.example.myfirstwebproject.controllers;

import com.example.myfirstwebproject.models.Person;
import com.example.myfirstwebproject.services.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    private PeopleService service;

    @GetMapping("/people")
    public List<Person> index(){
       return service.index();
    }

}
