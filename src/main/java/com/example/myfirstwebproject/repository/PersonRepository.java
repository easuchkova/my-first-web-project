package com.example.myfirstwebproject.repository;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import com.example.myfirstwebproject.IncorrectAgeException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Slf4j
@Repository
@AllArgsConstructor
public class PersonRepository {

    private JdbcTemplate jdbcTemplate;

    public List<PersonDTO> showAllPeople() {
        return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(PersonDTO.class));
    }

    public PersonDTO findById(int id) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(PersonDTO.class))
                .stream().findAny().orElse(null);
    }

    public void addPerson(PersonDTO person) throws IncorrectAgeException {
        jdbcTemplate.update("INSERT INTO Person(name, age, hasPet) VALUES (?, ?, ?)", person.getName(), person.getAge(), person.isHasPet());
    }
    public void deletePerson(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }
}
