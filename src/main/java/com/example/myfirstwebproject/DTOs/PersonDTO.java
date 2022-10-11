package com.example.myfirstwebproject.DTOs;

import lombok.Data;

@Data
public class PersonDTO {
    private int id; //поля все же не final потому что с ним кажется не работает аннотация @Data
    private String name;
    private int age;
    private boolean hasPet;

    public PersonDTO(int id, String name, int age, boolean hasPet) {
    }

    public PersonDTO() {
    }
}
