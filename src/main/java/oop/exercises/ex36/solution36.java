/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex36;

import java.util.Scanner;

public class solution36 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        String input = "";
        StatsComputer calculator = new StatsComputer();
        while(!(input.equalsIgnoreCase("done")))
        {
            System.out.print("Enter a number: ");
            input = in.nextLine();
            if(validateInput(input))
                calculator.add(input);
        }
        String output = calculator.getList();
        output += calculator.getStatistics();
        System.out.println(output);
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
