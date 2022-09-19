package com.example.myfirstwebproject;

import com.example.myfirstwebproject.DTOs.PersonDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper {
    @Override
    public PersonDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        PersonDTO person = new PersonDTO();

        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAge(rs.getInt("age"));
        person.setHasPet(rs.getBoolean("hasPet"));

        return person;
    }
}
