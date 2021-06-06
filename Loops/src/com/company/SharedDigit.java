package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(!inclusiveChecker(num1) || !inclusiveChecker(num2))
            return false;
        else{
            if(oneNumberDigit(num1, num2) || oneNumberDigit(num2, num1))
                return true;

            return  false;
        }
    }

    public static boolean inclusiveChecker(int num){
        if(num >= 10 && num <= 99)
            return true;
        return false;
    }

    public static boolean oneNumberDigit(int num1, int num2){
        while(num1 > 0){
            if(num1 % 10 == num2 % 10 || (num1 / 10) % 10 == (num2 / 10) % 10)
                return true;
            else{
                num1 /= 10;
            }
        }
        return false;
    }
}
