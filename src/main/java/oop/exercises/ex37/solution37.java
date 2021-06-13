/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex37;

import java.util.Scanner;

public class solution37 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What's the minimum length? ");
        int minLength = in.nextInt();
        System.out.print("How many special characters? ");
        int specialCount = in.nextInt();
        System.out.print("How many numbers? ");
        int numCount = in.nextInt();

        PasswordGenerator yourPassword = new PasswordGenerator(minLength, specialCount, numCount);
        System.out.print(yourPassword.generate());
    }
}
