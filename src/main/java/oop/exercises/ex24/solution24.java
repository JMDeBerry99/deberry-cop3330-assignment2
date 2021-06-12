/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex24;

import java.util.Scanner;

public class solution24 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String word1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = in.nextLine();

        AnagramChecker checker = new AnagramChecker();
        boolean answer = checker.isAnagram(word1, word2);

        System.out.println(results(answer, word1, word2));

    }

    private static String results(boolean answer, String word1, String word2) {
        if(answer)
        {
            return "\"" + word1 + "\" and \"" + word2 + "\" are anagrams.";
        }
        else
        {
            return "\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.";
        }
    }
}
