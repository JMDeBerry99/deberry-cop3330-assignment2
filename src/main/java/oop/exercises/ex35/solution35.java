/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class solution35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<String> people = new ArrayList<>();
        while(true)
        {
            System.out.print("Enter a name: ");
            String name = in.nextLine();
            if(name.equals(""))
                break;
            people.add(name);
        }
        System.out.print("The winner is... " + pickWinner(people) + ".");
    }

    public static String pickWinner(ArrayList<String> people)
    {
        Random rand = new Random();
        int num = rand.nextInt(people.size());
        return people.get(num);
    }
}
