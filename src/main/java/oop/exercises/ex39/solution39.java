/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex39;

import java.util.HashMap;
import java.util.Map;

public class solution39 {

    private static HashMap<Integer, Employee> records = new HashMap<>();

    public static void main(String[] args)
    {


        records.put(0, new Employee("John", "Johnson", "Manager", "2016-12-31"));
        records.put(1, new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        records.put(2, new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        records.put(3, new Employee("Jake", "Jacobson", "Programmer", " "));
        records.put(4, new Employee("Jacquelyn", "Jackson", "DBA", " "));
        records.put(5, new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        sortByLastName();
        String output = "";
        output += tableHeader();
        output += createTable();
        System.out.println(output);
    }

    public static void sortByLastName()
    {
        int currentKey;
        for(int i = 0; i < records.size(); i++)
        {
            currentKey = i;
            for(int j = i; j < records.size(); j++)
            {
                if(records.get(i).getLastName().compareToIgnoreCase(records.get(j).getLastName()) > 1)
                    currentKey = j;
            }
            if(currentKey != i)
            {
                swapKeys(i, currentKey);
            }
        }
    }

    public static void swapKeys(int empKey1, int empKey2)
    {
        records.put(records.size(), records.get(empKey1));
        records.put(empKey1, records.get(empKey2));
        records.put(empKey2, records.get(records.size()-1));
        records.remove(records.size()-1);
    }


    private static String tableHeader() {
        String output = "";
        output += "Name                | Position          | Separation Date" +
                "\n--------------------|-------------------|----------------";
        return output;
    }

    private static String createTable() {
        String output = "";
        for(Map.Entry i : records.entrySet())
        {
            String nameString = "\n" + ((Employee)i.getValue()).getFirstName() + " " + ((Employee)i.getValue()).getLastName();
            int numSpaces = 21 - nameString.length();
            for(int k = 0; k < numSpaces; k++)
            {
                nameString += " ";
            }
            output += nameString;

            String dateString = "| " + ((Employee)i.getValue()).getPosition();
            numSpaces = 20 - dateString.length();
            for(int k = 0; k < numSpaces; k++)
            {
                dateString += " ";
            }
            output += dateString;

            String positionString = "| " + ((Employee)i.getValue()).getSeparationDate();
            numSpaces = 21 - positionString.length();
            for(int k = 0; k < numSpaces; k++)
            {
                positionString += " ";
            }
            output += positionString;
        }
        return output;
    }


}
