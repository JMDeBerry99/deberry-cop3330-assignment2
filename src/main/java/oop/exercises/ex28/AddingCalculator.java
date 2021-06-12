/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex28;

public class AddingCalculator {

    private int sum = 0;

    public void add(int num) {
        sum += num;
    }

    public String sum() {
        return "The total is " + sum + ".";
    }
}
