package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.IncorrectAgeException;
import com.example.myfirstwebproject.repository.PersonRepository;
import com.example.myfirstwebproject.DTOs.PersonDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    public PersonRepository personRepository;

    public List<PersonDTO> showAllPeople() {
        return personRepository.showAllPeople();
    }

    public PersonDTO findById(int id) {
        return personRepository.findById(id);
    }

    public void addPerson(PersonDTO person) throws IncorrectAgeException {
        if (person.getAge() < 0) {
            throw new IncorrectAgeException("Age cannot be less than 0, but you entered " + person.getAge());
        } else {
            personRepository.addPerson(person);
        }
    }

    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }

}
