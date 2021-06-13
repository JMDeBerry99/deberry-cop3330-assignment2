/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex32;

import java.util.Scanner;

public class solution32 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumberGame game;
        boolean playAgain = true;
        System.out.println("Let's play Guess the Number!");

        while (playAgain) {
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            String difficulty = in.nextLine();
            String output;

            game = new NumberGame();
            output = game.setup(difficulty);
            System.out.print(output);

            while (!(game.numGuessed())) {
                String number = in.nextLine();
                output = game.guess(number);
                System.out.print(output);
            }
            System.out.print("\nDo you wish ot play again (Y/N)? ");
            String answer = in.nextLine();
            if(answer.equalsIgnoreCase("N"))
                playAgain = false;
        }
    }
}
