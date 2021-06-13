/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex37;

import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {
    private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
            'w','x','y','z'};
    private char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    private char[] specialChars = {'!','#','$','%','&','*','+','-','.',':','<','=','>','?','@','^','_','~'};
    private int length;
    private int specialCharCount;
    private int numCount;
    private int letterCount;
    private ArrayList<Character> toUse = new ArrayList<>();
    private Random rand = new Random();

    public PasswordGenerator(int minimumLength, int numOfSpecialCharacters, int numOfNumbers)
    {

        specialCharCount = numOfSpecialCharacters;
        numCount = numOfNumbers;
        int minLetters = numOfSpecialCharacters + numOfNumbers;
        length = Math.max(minimumLength, minLetters + numOfNumbers + numOfSpecialCharacters);
        letterCount = length - specialCharCount - numCount;
    }

    public String generate()
    {
        generateSpecialChars();
        generateNums();
        generateLetters();
        return constructPassword();
    }

    private void generateSpecialChars()
    {
        for(int i = 0; i < specialCharCount; i++)
        {
            int listIndex = rand.nextInt(specialChars.length);
            toUse.add(specialChars[listIndex]);
        }
    }

    private void generateNums()
    {
        for(int i = 0; i < numCount; i++)
        {
            int listIndex = rand.nextInt(numbers.length);
            toUse.add(numbers[listIndex]);
        }
    }

    private void generateLetters()
    {
        for(int i = 0; i < letterCount; i++)
        {
            int listIndex = rand.nextInt(letters.length);
            toUse.add(letters[listIndex]);
        }
    }

    private String constructPassword()
    {
        String password = "";
        while(toUse.size() > 0)
        {
            int toUseIndex = rand.nextInt(toUse.size());
            password += toUse.get(toUseIndex);
            toUse.remove(toUseIndex);
        }
        return "Your password is " + password;
    }
}
