package com.example.myfirstwebproject.DTOs;

import lombok.Data;

@Data
public class PersonDTO {
    private int id;
    private String name;
    private int age;
    private boolean hasPet;
}
