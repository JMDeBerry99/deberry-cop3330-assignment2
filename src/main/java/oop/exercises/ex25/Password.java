/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex25;

public class Password {

    private String password;

    public Password(String passwordString)
    {
        password = passwordString;
    }

    public int passwordValidator()
    {
        return numberCheck() + letterCheck() + lengthCheck() + specialCharacterCheck();
    }

    public int numberCheck()
    {
        char[] passwordArray = password.toCharArray();

        for (char c : passwordArray) {
            if (Character.isDigit(c)) {
                return 1;
            }
        }

        return 0;
    }

    public int letterCheck()
    {
        char[] passwordArray = password.toCharArray();

        for (char c : passwordArray) {
            if (Character.isLetter(c)) {
                return 2;
            }
        }

        return 0;
    }

    public int lengthCheck()
    {
        if(password.length() < 8)
            return 0;
        else
            return 1;
    }

    public int specialCharacterCheck()
    {
        char[] passwordArray = password.toCharArray();
        String specialCharacters = "!$%&'()*+,-./:;<=>?@[]^_`{|}~";

        for (char c : passwordArray) {
            if (specialCharacters.contains(Character.toString(c))) {
                return 1;
            }
        }

        return 0;
    }

    public String getPassword() {
        return password;
    }
}
