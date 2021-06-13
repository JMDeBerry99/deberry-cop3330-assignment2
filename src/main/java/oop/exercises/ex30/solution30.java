/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex30;

public class solution30 {
    public static void main(String[] args)
    {
        MultiplicationTable oneToTwelve = new MultiplicationTable(1, 12);
        String output = oneToTwelve.generate();
        System.out.println(output);
    }
}
