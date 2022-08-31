package com.example.myfirstwebproject.repository;

import com.example.myfirstwebproject.DTOs.Person;
import com.example.myfirstwebproject.IncorrectAgeException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Repository
@AllArgsConstructor
public class PersonRepository {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "superpassword";
    private static final String SQL_SELECT_ALL = "SELECT * FROM Person";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM Person WHERE id=?";
    private static final String SQL_ADD_NEW_PERSON = "INSERT INTO Person (name, age, hasPet) VALUES (?, ?, ?)";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            log.error("Something went wrong. SQL Exception ", e);
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            log.error("Something went wrong. SQL Exception ", e);
        }
    }

    public static List<Person> showAllPeople() {
        List<Person> people = new ArrayList<>();


        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL);

            while (resultSet.next()) {

                Person person;
                person = parsePersonInfo(resultSet);

                people.add(person);
            }

        } catch (SQLException e) {
            log.error("Something went wrong. SQL Exception ", e);
        }
        return people;
    }

    public static Person findById(int id) {
        Person person = null;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            person = parsePersonInfo(resultSet);

        } catch (SQLException e) {
            log.error("Something went wrong. You have SQL Exception ", e);
        }

        return person;
    }

    public static void addPerson(Person person) {

        if (person.getAge() < 0) {
            try {
                throw new IncorrectAgeException("Age cannot be less than 0, but you entered " + person.getAge());
            } catch (IncorrectAgeException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_ADD_NEW_PERSON);

            preparedStatement.setString(1, person.getName());
            preparedStatement.setInt(2, person.getAge());
            preparedStatement.setBoolean(3, person.isHasPet());

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            log.error("Something went wrong ... ", e);
        }


    }

    public static Person parsePersonInfo(ResultSet resultSet) {
        Person person = new Person();

        try {
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setAge(resultSet.getInt("age"));
            person.setHasPet(resultSet.getBoolean("hasPet"));


        } catch (SQLException e) {
            log.error("Something went wrong. You have SQL Exception ", e);
        }

        return person;
    }

}
