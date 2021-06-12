/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex26;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class PaymentCalculator {
    private double balance;
    private double aprDaily;
    private double monthlyPayment;
    public PaymentCalculator(double balanceInput, double aprInput, double monthlyPaymentInput)
    {
        balance = balanceInput;
        aprDaily = aprInput / 100 / 365;
        monthlyPayment = monthlyPaymentInput;
    }

    public double roundUpCent(double number)
    {
        if((number * 1000) % 10 >=5)
        {
            number += 0.01;
        }
        return number;
    }

    public int calculateMonthsUntilPaidOff() {
        balance = this.roundUpCent(balance);
        monthlyPayment = this.roundUpCent(monthlyPayment);

        double months = -1 * log(1 + balance/monthlyPayment * (1 - pow(1 + aprDaily, 30))) / log(1 + aprDaily) / 30;

        return ((int) months + 1);
    }
}
