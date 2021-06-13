/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex38;

import java.util.Scanner;

public class solution38 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();
        String[] fullListString = input.split(" ");

        int[] fullList = new int[fullListString.length];
        for(int i = 0; i < fullList.length; i++)
        {
            fullList[i] = Integer.parseInt(fullListString[i]);
        }

        int[] evenNumbers = filterEvenNumbers(fullList);
        System.out.print("The even numbers are" + printArray(evenNumbers) + ".");
    }

    public static int[] filterEvenNumbers(int[] oldArray)
    {
        int evenCount = 0;
        for(int i : oldArray)
        {
            if(i%2 == 0)
                evenCount++;
        }

        int[] newArray = new int[evenCount];
        int newIndex = 0;
        for (int j : oldArray) {
            if (j % 2 == 0) {
                newArray[newIndex] = j;
                newIndex++;
            }
        }

        return newArray;
    }

    public static String printArray(int[] array)
    {
        String output = "";
        for(int i : array)
        {
            output += " " + i;
        }
        return output;
    }
}
