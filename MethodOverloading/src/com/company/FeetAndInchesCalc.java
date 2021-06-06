package com.company;

public class FeetAndInchesCalc {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >= 0 && (inches >= 0 && inches <=12)){
            double centiMetres = ((feet * 12) + inches) * 2.54;
            System.out.println("This is " + feet + " feet and " + inches + " inches. Total: " + centiMetres + " cm");
            return centiMetres;
        }
        System.out.println("Invalid value");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches >= 0) {
            int feet = inches / 12;
            int remainInches = inches % 12;
            System.out.println("Your data: " + inches);
            return calcFeetAndInchesToCentimeters(feet, remainInches);
        }
        System.out.println("Invalid value");
        return -1;
    }

}
