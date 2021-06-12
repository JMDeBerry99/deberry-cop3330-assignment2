/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex27;

public class Validator {

    public String validateInput(String firstName, String lastName, String zipCode, String idNumber)
    {
        String result = "";

        result = result + validateFirstName(firstName);
        result = result + validateLastName(lastName);
        result = result + validateZIP(zipCode);
        result = result + validateID(idNumber);

        if(result.equals(""))
            return "\nThere were no errors found.";

        return result;

    }

    public String validateFirstName(String name) {

        String output = "";

        if(name.length() < 2)
        {
            output = output + "\nThe first name must be at least 2 characters long.";
        }

        if(name.equals(""))
        {
            output = output + "\nThe first name must be filled in.";
        }

        return output;

    }

    public String validateLastName(String name) {

        String output = "";

        if(name.length() < 2)
        {
            output = output + "\nThe last name must be at least 2 characters long.";
        }

        if(name.equals(""))
        {
            output = output + "\nThe last name must be filled in.";
        }

        return output;

    }

    public String validateZIP(String zipCode) {
        char[] zipCodeArray = zipCode.toCharArray();

        if(zipCodeArray.length == 5)
        {
            for (char c : zipCodeArray)
            {
                if (!Character.isDigit(c))
                {
                    return "\nThe zipcode must be a 5 digit number.";
                }
            }
            return "";
        }
        return "\nThe zipcode must be a 5 digit number.";
    }

    public String validateID(String idNumber) {
        char[] idArray = idNumber.toCharArray();

        if(idArray.length == 7)
        {
            int i;
            for (i = 0; i < 2; i++)
            {
                if (!Character.isLetter(idArray[i]))
                {
                    return "\nThe employee ID must be in the format of AA-1234.";
                }
            }

            if(!(idArray[2] == '-'))
            {
                return "\nThe employee ID must be in the format of AA-1234.";
            }

            for (i = 3; i < 7; i++)
            {
                if (!Character.isDigit(idArray[i]))
                {
                    return "\nThe employee ID must be in the format of AA-1234.";
                }
            }

            return "";
        }
        return "\nThe employee ID must be in the format of AA-1234.";
    }
}
