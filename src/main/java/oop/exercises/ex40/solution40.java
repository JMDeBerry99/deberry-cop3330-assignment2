/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex40;

import oop.exercises.ex39.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution40 {
    private static HashMap<Integer, oop.exercises.ex39.Employee> records = new HashMap<>();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        records.put(0, new oop.exercises.ex39.Employee("John", "Johnson", "Manager", "2016-12-31"));
        records.put(1, new oop.exercises.ex39.Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        records.put(2, new oop.exercises.ex39.Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        records.put(3, new oop.exercises.ex39.Employee("Jake", "Jacobson", "Programmer", " "));
        records.put(4, new oop.exercises.ex39.Employee("Jacquelyn", "Jackson", "DBA", " "));
        records.put(5, new oop.exercises.ex39.Employee("Sally", "Webber", "Web Developer", "2015-12-18"));
        System.out.print("Enter a search string: ");
        String input = in.nextLine();

        System.out.println(filterBySearchTerm(input));
    }

    public static String filterBySearchTerm(String searchTerm)
    {
        String output = "\nResults:\n";
        output += tableHeader();

        for(Map.Entry i : records.entrySet())
        {
            if(((Employee)i.getValue()).getFirstName().contains(searchTerm) ||
                    ((Employee)i.getValue()).getLastName().contains(searchTerm))
            {
                String nameString = "\n" + ((oop.exercises.ex39.Employee) i.getValue()).getFirstName() + " " + ((oop.exercises.ex39.Employee) i.getValue()).getLastName();
                int numSpaces = 21 - nameString.length();
                for (int k = 0; k < numSpaces; k++) {
                    nameString += " ";
                }
                output += nameString;

                String dateString = "| " + ((oop.exercises.ex39.Employee) i.getValue()).getPosition();
                numSpaces = 20 - dateString.length();
                for (int k = 0; k < numSpaces; k++) {
                    dateString += " ";
                }
                output += dateString;

                String positionString = "| " + ((Employee) i.getValue()).getSeparationDate();
                numSpaces = 21 - positionString.length();
                for (int k = 0; k < numSpaces; k++) {
                    positionString += " ";
                }
                output += positionString;
            }
        }

        return output;
    }

    private static String tableHeader() {
        String output = "";
        output += "\nName                | Position          | Separation Date" +
                "\n--------------------|-------------------|----------------";
        return output;
    }
}
