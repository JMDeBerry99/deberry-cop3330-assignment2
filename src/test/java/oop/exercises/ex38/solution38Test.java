package oop.exercises.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution38Test {

    @Test
    void filterEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {2, 4, 6};
        int[] actual = solution38.filterEvenNumbers(array);
        assertEquals(solution38.printArray(expected), solution38.printArray(actual));
    }
}