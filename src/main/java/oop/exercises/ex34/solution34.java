/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex34;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class solution34 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        EmployeeList empList = new EmployeeList(employees);
        System.out.println(empList.display());

        System.out.print("\nEnter an employee to remove: ");
        String toRemove = in.nextLine();
        empList.remove(toRemove);

        System.out.println(empList.display());

    }


}

