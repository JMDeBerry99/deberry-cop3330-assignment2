/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex26;

import java.util.Scanner;

public class solution26 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = in.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = in.nextDouble();

        PaymentCalculator calculator = new PaymentCalculator(balance, apr, monthlyPayment);
        int monthsUntilPaid = calculator.calculateMonthsUntilPaidOff();

        System.out.printf("It will take you %d months to pay off this card.", monthsUntilPaid);
    }

}
