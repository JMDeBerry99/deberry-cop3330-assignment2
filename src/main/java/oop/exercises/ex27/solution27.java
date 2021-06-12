/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex27;

import java.util.Scanner;

public class solution27 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the first name: ");
        String first = in.nextLine();
        System.out.print("Enter the last name: ");
        String last = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = in.nextLine();

        Validator user = new Validator();
        String output = user.validateInput(first, last, zip, id);
        System.out.print(output);
    }
}
