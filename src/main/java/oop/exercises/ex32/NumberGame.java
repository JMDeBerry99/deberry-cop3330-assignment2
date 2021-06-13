/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex32;

import java.util.Random;

public class NumberGame {
    int difficulty;
    int secretNumber;
    int numGuesses;
    boolean trueOnceGuessed;

    public String setup(String level)
    {
        difficulty = Integer.parseInt(level);
        generateNumber();
        numGuesses = 0;
        trueOnceGuessed = false;
        return "I have my number. What's your guess? ";
    }

    public void generateNumber()
    {
        Random rand = new Random();
        if(difficulty == 1)
        {
            secretNumber = rand.nextInt(10) + 1;
        }
        else if (difficulty == 2)
        {
            secretNumber = rand.nextInt(100) + 1;
        }
        else if (difficulty == 3)
        {
            secretNumber = rand.nextInt(1000) + 1;
        }
    }

    public String guess(String input)
    {
        numGuesses++;
        if(!(validateInput(input)))
        {
            return "That's not a number. Guess again: ";
        }

        int guess = Integer.parseInt(input);
        if(guess == secretNumber)
        {
            trueOnceGuessed = true;
            return "You got it in " + numGuesses + " guesses!\n";
        }
        else if(guess < secretNumber)
        {
            return "Too low. Guess again: ";
        }
        else
        {
            return "Too high. Guess again: ";
        }
    }

    public boolean numGuessed()
    {
        return trueOnceGuessed;
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
