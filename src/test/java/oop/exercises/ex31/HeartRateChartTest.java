package oop.exercises.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateChartTest {

    @Test
    void generate() {
        HeartRateChart test = new HeartRateChart();
        String output = test.generate(65, 22, 55, 65);
        assertEquals("Resting Pulse: 65        Age: 22\n\nIntensity    | Rate\n-------------|--------" +
                        "\n55%          | 138 bpm\n60%          | 145 bpm\n65%          | 151 bpm", output);
    }
}