package com.example.myfirstwebproject.services;

import com.example.myfirstwebproject.DAOs.PersonDAO;
import com.example.myfirstwebproject.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    private PersonDAO personDAO;

    public List<Person> index(){
        return personDAO.index();
    }

}
