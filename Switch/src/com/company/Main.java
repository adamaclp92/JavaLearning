package com.company;

public class Main {

    public static void main(String[] args) {

        //Switch char
        SwitchChar.switchChar('D');
        SwitchChar.switchChar('f');
        System.out.println();

        //Print number in word
        NumberInWord.printNumberInWord(8);
        NumberInWord.printNumberInWord(12);
        System.out.println();

        //Leap year
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println();

        //Day of the months
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

    }
}
