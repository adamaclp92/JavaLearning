package com.company;

public class SumDigits {
    public static int sumDigits(int number){
        int sum = 0;
        if(number >= 10){
            do{
                sum += number % 10;
                number = number / 10;
            }while(number > 0);
            return sum;
        }
        else
             return -1;
    }
}
