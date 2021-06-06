package com.company;

public class InterestCalc {
    public static void calculateInterest(double amount, double interestRate){
        for (; interestRate < 9; interestRate++)
        {
            System.out.println((int)amount + " at " + (int)interestRate + "% interest = " + String.format("%.0f",amount * (interestRate / 100)));
        }

    }
}
