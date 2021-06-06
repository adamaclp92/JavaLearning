package com.company;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;
        else{
            int lastDigit = number % 10;

            while((number / 10) > 0){
                number /= 10;
            }

            System.out.println("Első számjegy: " + number + ", utolsó számjegy: " + lastDigit);
            return number + lastDigit;
        }
    }
}
