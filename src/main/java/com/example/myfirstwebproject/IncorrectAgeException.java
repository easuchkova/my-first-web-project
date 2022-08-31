package com.example.myfirstwebproject;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException (String errorMassage) {
        super(errorMassage);
    }
}
