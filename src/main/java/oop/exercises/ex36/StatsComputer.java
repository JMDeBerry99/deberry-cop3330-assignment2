/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex36;

import java.util.ArrayList;

public class StatsComputer {
    private ArrayList<Integer> list = new ArrayList<>();

    public void add(String num)
    {
        list.add(Integer.parseInt(num));
    }

    public String getList()
    {
        String output = "Numbers: ";
        for (Integer integer : list) {
            output += integer + ", ";
        }
        return output;
    }

    public String getStatistics()
    {
        String output = "";
        output += "\nThe average is " + (Math.floor(average() * 100) / 100);
        output += min();
        output += max();
        output += std();
        return output;
    }

    private double average()
    {
        String output = "";
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

    private String min()
    {
        String output;
        int minimum = list.get(0);
        for (Integer integer : list) {
            if (integer < minimum)
                minimum = integer;
        }
        output = "\nThe minimum is " + minimum;
        return output;
    }

    private String max()
    {
        String output;
        int maximum = list.get(0);
        for (Integer integer : list) {
            if (integer > maximum)
                maximum = integer;
        }
        output = "\nThe maximum is " + maximum;
        return output;
    }

    private String std()
    {
        String output;
        double average = average();
        double stdDev = 0;
        for(int i : list)
        {
            stdDev += Math.pow(i - average, 2);
        }
        stdDev = stdDev / list.size();
        stdDev = Math.pow(stdDev, 0.5);
        output = "\nThe standard deviation is " + (Math.floor(stdDev * 100) / 100);
        return output;
    }
}
