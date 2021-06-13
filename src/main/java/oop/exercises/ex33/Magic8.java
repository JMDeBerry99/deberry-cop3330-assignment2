/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex33;

import java.util.Random;

public class Magic8 {
    Random rand = new Random();
    String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};

    public String roll()
    {
        int num = rand.nextInt(3);
        return response(num);
    }

    public String response(int roll)
    {
        return answers[roll];
    }
}
