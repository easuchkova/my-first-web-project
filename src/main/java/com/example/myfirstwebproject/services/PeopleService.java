package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.DAOs.PersonRepository;
import com.example.myfirstwebproject.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    public List<Person> showAllPeople() {
        return PersonRepository.showAllPeople();
    }

    public Person findById(int id) {
        return PersonRepository.findById(id);
    }

}
