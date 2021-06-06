package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Barking Dog
        System.out.println("Barking dog:");
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
        System.out.println();

        //Leap year calculation
        System.out.println("Leap year calculation:");
        System.out.println(LeapYearCalculation.isLeapYear(-1600));
        System.out.println(LeapYearCalculation.isLeapYear(1600));
        System.out.println(LeapYearCalculation.isLeapYear(2020));
        System.out.println(LeapYearCalculation.isLeapYear(2000));
        System.out.println();

        //Decimal Comparator
        System.out.println("Decimal comparator:");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println();

        //Equal sum checker
        System.out.println("Equal sum checker:");
        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));
        System.out.println();

        //Teen number checker
        System.out.println("Teen number checker");
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println();

        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
        System.out.println();
    }
}
