package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class EqualityPrinter {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String EQUAL_NUMBERS_MESSAGE = "All numbers are equal";
    private static final String NOT_EQUAL_NUMBERS_MESSAGE = "All numbers are different";
    private static final String ELSE_NUMBERS_MESSAGE = "Neither all are equal or different";

    public static void printEqual(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0)
            System.out.println(INVALID_VALUE_MESSAGE);
        else if(a == b && a == c)
            System.out.println(EQUAL_NUMBERS_MESSAGE);
        else if(a != b && a != c && b != c)
            System.out.println(NOT_EQUAL_NUMBERS_MESSAGE);
        else
            System.out.println(ELSE_NUMBERS_MESSAGE);
    }
}
