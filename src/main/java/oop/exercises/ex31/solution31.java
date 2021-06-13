/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex31;

import java.util.Scanner;

public class solution31 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Resting Pulse: ");
        String input = in.nextLine();
        if(!(validateInput(input)))
        {
            System.out.println("Invalid input, shutting down...");
            System.exit(0);
        }
        int resting = Integer.parseInt(input);

        System.out.print("Age: ");
        input = in.nextLine();
        if(!(validateInput(input)))
        {
            System.out.println("Invalid input, shutting down...");
            System.exit(0);
        }
        int age = Integer.parseInt(input);

        HeartRateChart chart = new HeartRateChart();
        String output = chart.generate(resting, age);
    }

    public static boolean validateInput(String input)
    {
        char[] inputArray = input.toCharArray();
        boolean result = true;

        for(char c : inputArray)
        {
            if(!(Character.isDigit(c)))
                result = false;
        }
        return result;
    }
}
