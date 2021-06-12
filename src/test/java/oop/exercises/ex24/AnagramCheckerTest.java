package oop.exercises.ex24;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void sameLength_test_1() {
        AnagramChecker test = new AnagramChecker();
        assertTrue(test.sameLength("note", "tone"));
    }
    @Test
    void sameLength_test_2() {
        AnagramChecker test = new AnagramChecker();
        assertFalse(test.sameLength("note", "stone"));
    }

    @Test
    void sameLetters_test_1() {
        AnagramChecker test = new AnagramChecker();
        assertTrue(test.sameLetters("note", "tone"));
    }

    @Test
    void sameLetters_test_2() {
        AnagramChecker test = new AnagramChecker();
        assertFalse(test.sameLetters("note", "wont"));
    }

    @Test
    void isAnagram_test_1() {
        AnagramChecker test = new AnagramChecker();
        assertTrue(test.isAnagram("note", "tone"));
    }

    @Test
    void isAnagram_test_2() {
        AnagramChecker test = new AnagramChecker();
        assertFalse(test.isAnagram("note", "tonet"));
    }
}