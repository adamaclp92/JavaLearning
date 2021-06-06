package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class AreaCalculator {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value ";
    public static final double MINUS_ONE = -1.0;

    public static double area(double radius){
        if(radius < 0){
            System.out.printf(INVALID_VALUE_MESSAGE);
            return MINUS_ONE;
        }

        System.out.printf("A kör területe: ");
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            System.out.printf(INVALID_VALUE_MESSAGE);
            return MINUS_ONE;
        }
        System.out.printf("A téglalap területe: ");
        return x * y;

    }
}
