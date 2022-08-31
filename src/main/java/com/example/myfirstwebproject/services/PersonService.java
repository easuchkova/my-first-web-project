package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.repository.PersonRepository;
import com.example.myfirstwebproject.DTOs.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public List<Person> showAllPeople() {
        return PersonRepository.showAllPeople();
    }

    public Person findById(int id) {
        return PersonRepository.findById(id);
    }

    public void addPerson(Person person){
        PersonRepository.addPerson(person);
    }
}
