package com.packagechallenge;

public class Series {
    public int nSum(int n){
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
    }

    public int factorial(int n){
        if(n == 0){
            return 0;
        }else{
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public int fibo(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        else{
            int fibo1 = 0;
            int fibo2 = 1;
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                sum = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = sum;
            }
            return sum;
        }
    }

}
