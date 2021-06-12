package oop.exercises.ex25;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void numberCheck_test_1() {
        Password test = new Password("password123");
        int expected = 1;
        int actual = test.numberCheck();
        assertEquals(actual, expected);
    }

    @Test
    void numberCheck_test_2() {
        Password test = new Password("password");
        int expected = 0;
        int actual = test.numberCheck();
        assertEquals(actual, expected);
    }

    @Test
    void letterCheck_test_1() {
        Password test = new Password("password");
        int expected = 2;
        int actual = test.letterCheck();
        assertEquals(actual, expected);
    }

    @Test
    void letterCheck_test_2() {
        Password test = new Password("161!@#$");
        int expected = 0;
        int actual = test.letterCheck();
        assertEquals(actual, expected);
    }

    @Test
    void lengthCheck_test_1() {
        Password test = new Password("123fg6h");
        int expected = 0;
        int actual = test.lengthCheck();
        assertEquals(actual, expected);
    }

    @Test
    void lengthCheck_test_2() {
        Password test = new Password("1s3fd6r8");
        int expected = 1;
        int actual = test.lengthCheck();
        assertEquals(actual, expected);
    }

    @Test
    void specialCharacterCheck_test_1() {
        Password test = new Password("1s3f!&$%");
        int expected = 1;
        int actual = test.specialCharacterCheck();
        assertEquals(actual, expected);
    }

    @Test
    void specialCharacterCheck_test_2() {
        Password test = new Password("1s3fd6r8");
        int expected = 0;
        int actual = test.specialCharacterCheck();
        assertEquals(actual, expected);
    }

    @Test
    void getPassword_test_1() {
        Password test = new Password("password");
        String expected = "password";
        String actual = test.getPassword();
        assertEquals(actual, expected);
    }

    @Test
    void getPassword_test_2() {
        Password test = new Password("password");
        String expected = "notMyPassword";
        String actual = test.getPassword();
        assertNotEquals(actual, expected);
    }

    @Test
    void passwordValidator_outputs_1() {
        Password test = new Password("1234");
        int actual = test.passwordValidator();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_outputs_2() {
        Password test = new Password("abcd");
        int actual = test.passwordValidator();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_outputs_4() {
        Password test = new Password("abcd12rgd");
        int actual = test.passwordValidator();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_outputs_5() {
        Password test = new Password("abcd!12r#gd");
        int actual = test.passwordValidator();
        int expected = 5;
        assertEquals(expected, actual);
    }

}