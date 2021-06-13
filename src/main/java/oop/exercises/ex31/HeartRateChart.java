/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex31;

public class HeartRateChart {
    private int resting;
    private int age;
    private int lowPercent;
    private int highPercent;

    public String generate(int restingInput, int ageInput, int lowIntensity, int highIntensity) {
        resting = restingInput;
        age = ageInput;
        lowPercent = lowIntensity;
        highPercent = highIntensity;
        String output = "";

        output += setup();
        output += dataLoop();
        return output;
    }

    private String setup() {
        String output = "";
        output += "Resting Pulse: " + resting + "        Age: " + age;
        output += "\n\nIntensity    | Rate";
        output += "\n-------------|--------";
        return output;
    }

    private String dataLoop()
    {
        String output = "";
        for(int i = lowPercent; i <= highPercent; i += 5)
        {
            output += "\n" + i + "%          | " + calculateTarget(i) + " bpm";
        }
        return output;
    }

    private int calculateTarget(int intensity)
    {
        double intensityPercent = ((double)intensity)/100;
        double target = (((220 - age) - resting) * intensityPercent) + resting;
        return roundToInt(target);
    }

    private int roundToInt(double input)
    {
        if((input*10) % 10 >= 5)
            input++;
        return ((int)input);
    }
}
