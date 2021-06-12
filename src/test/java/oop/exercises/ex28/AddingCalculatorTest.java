package oop.exercises.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingCalculatorTest {

    @Test
    void sum() {
        AddingCalculator test = new AddingCalculator();
        for(int i = 1; i < 6; i++)
        {
            test.add(i);
        }
        assertEquals("The total is 15.", test.sum());
    }
}