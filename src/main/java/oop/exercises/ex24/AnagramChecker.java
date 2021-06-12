/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex24;

import java.util.Arrays;

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
        String word1Sorted = sortByLetter(word1.toLowerCase());
        String word2Sorted = sortByLetter(word2.toLowerCase());
        return word1Sorted.equals(word2Sorted);
    }

    private String sortByLetter(String word) {
        char[] array = word.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
