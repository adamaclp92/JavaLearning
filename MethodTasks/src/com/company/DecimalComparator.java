package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        String number1ToString = String.valueOf(number1);
        String number2ToString = String.valueOf(number2);
        if(number1ToString.charAt(0) == number2ToString.charAt(0) &&
                number1ToString.charAt(1) == number2ToString.charAt(1) &&
                number1ToString.charAt(2) == number2ToString.charAt(2))
            return true;
        return false;
    }
}
