/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex24;

public class AnagramChecker {
    public boolean isAnagram(String word1, String word2)
    {
        return sameLength(word1, word2) && sameLetters(word1, word2);
    }

    public boolean sameLength(String word1, String word2)
    {
        return word1.length() == word2.length();
    }

    public boolean sameLetters(String word1, String word2)
    {
        return true;
    }
}
