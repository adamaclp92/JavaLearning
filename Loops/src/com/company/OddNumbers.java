package com.company;

public class OddNumbers {
    public static boolean isOdd(int number){
        if(number <= 0)
            return false;
        else if(number % 2 == 1)
            return true;
        return false;
    }

    public static int sumOdd(int start, int end){
        if(end >= start && start >= 0){
            int sum = 0;
            for(int i = start; i <= end; i++){
                if(isOdd(i))
                    sum += i;
            }
            return sum;
        }
        else return -1;
    }
}
