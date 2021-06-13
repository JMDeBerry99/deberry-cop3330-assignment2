package oop.exercises.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution29Test {

    @Test
    void validateInput_false_0() {
        assertFalse(solution29.validateInput("0"));
    }

    @Test
    void validateInput_false_letters() {
        assertFalse(solution29.validateInput("abc"));
    }

    @Test
    void validateInput_true() {
        assertTrue(solution29.validateInput("4"));
    }

    @Test
    void calculateReturnRate_pass() {
        assertEquals(72, solution29.calculateReturnRate("1"));
    }
}