package com.example.myfirstwebproject.repository;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import com.example.myfirstwebproject.PersonRowMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.myfirstwebproject.utilits.Queries.*;

@Slf4j
@Repository
@AllArgsConstructor
public class PersonRepository {

    private NamedParameterJdbcTemplate jdbcTemplate;


    public List<PersonDTO> showAllPeople() {
        return jdbcTemplate.query(Q_PERSON_SHOW_ALL, new PersonRowMapper());
    }

    public PersonDTO findById(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return (PersonDTO) jdbcTemplate.query(Q_PERSON_FIND_BY_ID, params, new PersonRowMapper()).stream()
                .findFirst().orElseThrow();
    }

    public boolean addPerson(PersonDTO person) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", person.getName());
        params.put("age", person.getAge());
        params.put("hasPet", person.isHasPet());
        jdbcTemplate.update(Q_PERSON_ADD, params);
        return true;
    }
    public boolean deletePerson(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        jdbcTemplate.update(Q_PERSON_DELETE, params);
        return true;
    }
}
