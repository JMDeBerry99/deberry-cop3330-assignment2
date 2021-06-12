/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex25;

import java.util.Scanner;

public class solution25 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a password: ");
        String password = in.nextLine();
        Password pass = new Password(password);

        int strength = pass.passwordValidator();
        System.out.println(result(strength, pass.getPassword()));
    }

    public static String result(int strength, String password)
    {
        if(strength == 5)
        {
            return "The password '" + password + "' is a very strong password.";
        }
        else if(strength == 4)
        {
            return "The password '" + password + "' is a strong password.";
        }
        else if(strength == 2)
        {
            return "The password '" + password + "' is a weak password.";
        }
        else if(strength == 1)
        {
            return "The password '" + password + "' is a very weak password.";
        }
        return "";
    }
}
