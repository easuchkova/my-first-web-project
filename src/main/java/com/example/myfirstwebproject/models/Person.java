package com.example.myfirstwebproject.models;

public class Person {
    private int id;
    private String name;
    private int age;
    private boolean hasPet;

    public Person() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hasPet = hasPet;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }
}
