/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex29;

import java.util.Scanner;

public class solution29 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean value = true;
        String input = "";
        while(value)
        {
            System.out.print("What is the rate of return? ");
            input = in.nextLine();
            if(validateInput(input))
                value = false;
            System.out.println("Sorry. That's not a valid input.");
        }
        System.out.print("It will take " + calculateReturnRate(input) + " years to double your initial investment.");

    }

    public static boolean validateInput(String input)
    {
        char[] inputArray = input.toCharArray();
        boolean result = true;
        if(inputArray[0] == '0' && inputArray.length == 1)
            return false;

        for(char c : inputArray)
        {
            if(!(Character.isDigit(c)))
                result = false;
        }
        return result;
    }

    public static int calculateReturnRate(String rate)
    {
        int returnRate = Integer.parseInt(rate);
        return 72 / returnRate;
    }
}
