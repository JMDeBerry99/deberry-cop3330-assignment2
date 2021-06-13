/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex40;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String first, String last, String pos, String date)
    {
        firstName = first;
        lastName = last;
        position = pos;
        separationDate = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSeparationDate() {
        return separationDate;
    }
}
