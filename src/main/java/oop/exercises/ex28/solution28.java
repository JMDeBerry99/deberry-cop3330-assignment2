/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex28;

import java.util.Scanner;

public class solution28 {
    //just use a calculator dummy
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        AddingCalculator adder = new AddingCalculator();
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            adder.add(num);
        }
        System.out.println(adder.sum());
    }
}
