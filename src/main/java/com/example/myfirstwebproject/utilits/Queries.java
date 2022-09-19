package com.example.myfirstwebproject.utilits;

public class Queries {
    public static final String Q_PERSON_SHOW_ALL = "SELECT * FROM Person";
    public static final String Q_PERSON_FIND_BY_ID = "SELECT * FROM Person WHERE id=:id";
    public static final String Q_PERSON_ADD = "INSERT INTO Person(name, age, hasPet) VALUES (:name, :age, :hasPet)";
    public static final String Q_PERSON_DELETE = "DELETE FROM Person WHERE id=:id";
}
