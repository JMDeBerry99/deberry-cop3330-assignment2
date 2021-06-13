/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex33;

import java.util.Scanner;

public class solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("What's your question?");
        String question = in.nextLine();
        Magic8 ball = new Magic8();
        String output = ball.roll();
        System.out.print("\n" + output);
    }
}
