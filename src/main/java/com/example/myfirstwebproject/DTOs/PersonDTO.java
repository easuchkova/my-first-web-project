package com.example.myfirstwebproject.DTOs;

import lombok.Data;

@Data
public class PersonDTO {
    private final int id;
    private final String name;
    private final int age;
    private final boolean hasPet;


}
