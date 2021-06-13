package oop.exercises.ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsComputerTest {

    @Test
    void getStatistics() {
        StatsComputer test = new StatsComputer();
        test.add("100");
        test.add("200");
        test.add("1000");
        test.add("300");
        String expected = """

                The average is 400.0
                The minimum is 100
                The maximum is 1000
                The standard deviation is 353.55""";
        String actual = test.getStatistics();
        assertEquals(expected, actual);
    }
}