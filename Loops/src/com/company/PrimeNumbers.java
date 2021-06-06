package com.company;

public class PrimeNumbers {
    public static boolean isPrime(int number){
        if(number == 1 || number == 0)
            return false;

        for (int i = 2; i <= (long)Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public static void primeNumbersList(int maxNumber){
        System.out.println("Prímszámok: ");
        int count = 0;
        for(int i = 0; i <= maxNumber; i++){
            if(isPrime(i)){
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println("\nTalált prímszám darab: " + count);
    }
}
