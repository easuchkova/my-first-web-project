package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.IncorrectAgeException;
import com.example.myfirstwebproject.repository.PersonRepository;
import com.example.myfirstwebproject.DTOs.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;
    public List<PersonDTO> showAllPeople() {
        return personRepository.showAllPeople();
    }

    public PersonDTO findById(int id) {
        return personRepository.findById(id);
    }

    public void addPerson(PersonDTO person) throws IncorrectAgeException {
        personRepository.addPerson(person);
    }
}
