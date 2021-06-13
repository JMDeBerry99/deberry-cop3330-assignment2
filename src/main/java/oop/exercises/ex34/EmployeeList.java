/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex34;

public class EmployeeList {
    private String[] list;

    public EmployeeList(String[] array)
    {
        list = new String[array.length];
        System.arraycopy(array, 0, list, 0, array.length);
    }
    public String display()
    {
        StringBuilder output = new StringBuilder("There are " + list.length + " employees:");
        for(String employee : list)
        {
            output.append("\n").append(employee);
        }
        return output.toString();
    }

    public void remove(String name)
    {
        String[] temp = new String[list.length-1];
        int tempIndex = 0;
        for (String s : list) {
            if (!(name.equalsIgnoreCase(s))) {
                temp[tempIndex] = s;
                tempIndex++;
            }
        }
        list = new String[temp.length];
        System.arraycopy(temp, 0, list, 0, temp.length);
    }
    public String[] getList()
    {
        return list;
    }
}
