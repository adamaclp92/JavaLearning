package com.company;

public class Palindrom {
    public static boolean isPalindrome(int number){
        String palindromNum = "";
        number = Math.abs(number);
        int spareNumber = number;
        do{
            palindromNum += number % 10;
            number /= 10;

        }while (number > 0);
        System.out.println("Eredeti szám: " + spareNumber);
        System.out.println("Megfordított szám: " + palindromNum);
        if(Integer.parseInt(palindromNum) == spareNumber)
            return true;
        else
            return false;
    }
}
