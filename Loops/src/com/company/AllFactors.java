package com.company;

public class AllFactors {
    private static final String INVALID_MESSAGE  = "Invalid Value";
    public static void printFactors(int number){
        if(number < 1)
            System.out.println(INVALID_MESSAGE);
        else{
            for(int i = 1; i <= number; i++){
                if(number % i == 0)
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if(number < 1)
            return false;
        else{
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                   sum += i;
                }
            }
            if(sum == number)
                return true;
            return false;
        }
    }
}
