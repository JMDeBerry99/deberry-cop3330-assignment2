package oop.exercises.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8Test {

    @Test
    void response_test_0() {
        Magic8 test = new Magic8();
        assertEquals("Yes.", test.response(0));
    }

    @Test
    void response_test_1() {
        Magic8 test = new Magic8();
        assertEquals("No.", test.response(1));
    }

    @Test
    void response_test_2() {
        Magic8 test = new Magic8();
        assertEquals("Maybe.", test.response(2));
    }

    @Test
    void response_test_3() {
        Magic8 test = new Magic8();
        assertEquals("Ask again later.", test.response(3));
    }
}