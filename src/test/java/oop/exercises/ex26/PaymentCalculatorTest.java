package oop.exercises.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_test_1() {
        PaymentCalculator test = new PaymentCalculator(5000, 12, 100);
        int expected = 70;
        int actual = test.calculateMonthsUntilPaidOff();
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_test_2() {
        PaymentCalculator test = new PaymentCalculator(5000, 12, 100);
        int unexpected = 50;
        int actual = test.calculateMonthsUntilPaidOff();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void roundUpCent() {
        PaymentCalculator test = new PaymentCalculator(5000, 12, 100);
        double unexpected = 5000;
        double actual = test.roundUpCent(5000);
        assertEquals(unexpected, actual);
    }
}