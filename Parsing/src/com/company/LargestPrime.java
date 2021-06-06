package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1)
            return -1;
        else{
            int largestPrime = 1;
            for (int i = 2; i <= number; i++){
                while(number % i == 0){
                    number /= i;
                    largestPrime = i;
                }
            }
            return largestPrime;
        }
    }

}
