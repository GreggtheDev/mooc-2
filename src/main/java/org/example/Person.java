package org.example;

public class Person {
    private String name; // Field to store the person's name
    private int age; // Field to store the person's age

    // Constructor to initialize Person object
    public Person(String name, int age) {
        // Check if the name is null, empty, or longer than 40 characters
        if (name == null || name.isEmpty() || name.length() > 40) {
            // If any condition is met, throw an IllegalArgumentException with a descriptive message
            throw new IllegalArgumentException("Name must be non-null, non-empty, and less than or equal to 40 characters.");
        }
        // Check if the age is outside the range of 0 to 120 inclusive
        if (age < 0 || age > 120) {
            // If the age is invalid, throw an IllegalArgumentException with a descriptive message
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        // Assign the validated parameters to the instance variables
        this.name = name;
        this.age = age;
    }
