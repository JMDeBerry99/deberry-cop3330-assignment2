package oop.exercises.ex30;

public class MultiplicationTable {
    private int low;
    private int high;
    public MultiplicationTable(int lowNum, int highNum)
    {
        low = lowNum;
        high = highNum;
    }

    public String generate()
    {
        String output = "";
        int num;
        String numString;
        int numSpaces;
        for(int i = low; i <= high; i++)
        {
            for(int j = low; j <= high; j++)
            {
                num = i * j;
                numString = Integer.toString(num);
                numSpaces = 5 - numString.length();
                for(int k = 0; k < numSpaces; k++)
                {
                    output += " ";
                }
                output += numString;
            }
            output += "\n";
        }
        return output;
    }
}
