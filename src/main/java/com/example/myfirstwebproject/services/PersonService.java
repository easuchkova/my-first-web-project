package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.Exceptions.WebProjectException;
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

    public void addPerson(PersonDTO person) throws WebProjectException {
        if (person == null) {
            throw new WebProjectException("You entered null person"); // эта ошибка не вылетит, потому что id добавляется автоматом и вот он уже не пустой
        } else if (person.getAge() < 0) {
            throw new WebProjectException("Age cannot be less than 0, but you entered " + person.getAge());
        } else {
            personRepository.addPerson(person);
        }
    }

    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }

}
