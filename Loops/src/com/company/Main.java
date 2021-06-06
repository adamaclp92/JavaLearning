package com.company;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
//        Interest calculation
//        InterestCalc.calculateInterest(10000.0, 2.0);
//        System.out.println("********************");
//
//        Prime number
//        System.out.println(PrimeNumbers.isPrime(12));
//        PrimeNumbers.primeNumbersList(19);

//        Sum 3 and 5 challenge
//        System.out.println("3-mal és 5-tel osztható számok:");
//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <= 1000; i++){
//            if(i % 3 == 0 && i % 5 == 0) {
//                sum += i;
//                count++;
//                System.out.print(i + ", ");
//            }
//
//            if(count == 5)
//                break;
//        }
//        System.out.println("\nSzámok: " + count + " db, összeg: " + sum);


//        Odd numbers
//        System.out.println(OddNumbers.sumOdd(1, 100));
//        System.out.println(OddNumbers.sumOdd(-1, 100));
//        System.out.println(OddNumbers.sumOdd(100, 100));
//        System.out.println(OddNumbers.sumOdd(13, 13));
//        System.out.println(OddNumbers.sumOdd(100, -100));
//        System.out.println(OddNumbers.sumOdd(100, 1000));

//        // Sum number digits
//        System.out.println(SumDigits.sumDigits(125));
//        System.out.println(SumDigits.sumDigits(1));
//        System.out.println(SumDigits.sumDigits(1234));
//        System.out.println(SumDigits.sumDigits(-125));

        //Palindrome
//        System.out.println(Palindrom.isPalindrome(1));
//        System.out.println(Palindrom.isPalindrome(-1221));
//        System.out.println(Palindrom.isPalindrome(707));
//        System.out.println(Palindrom.isPalindrome(11212));

//        //Sum first and last digit
//        System.out.println(FirstAndLastDigit.sumFirstAndLastDigit(12115));
//        System.out.println(FirstAndLastDigit.sumFirstAndLastDigit(252));
//        System.out.println(FirstAndLastDigit.sumFirstAndLastDigit(257));
//        System.out.println(FirstAndLastDigit.sumFirstAndLastDigit(0));
//        System.out.println(FirstAndLastDigit.sumFirstAndLastDigit(5));
//        System.out.println(FirstAndLastDigit.sumFirstAndLastDigit(-10));

//        //Sum even digits
//        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
//        System.out.println(EvenDigitSum.getEvenDigitSum(252));
//        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

          //Shared Digits
//         System.out.println(SharedDigit.hasSharedDigit(21, 23));
//         System.out.println(SharedDigit.hasSharedDigit(9, 99));
//         System.out.println(SharedDigit.hasSharedDigit(15, 55));
//         System.out.println(SharedDigit.hasSharedDigit(15, 45));
//         System.out.println(SharedDigit.hasSharedDigit(15, 14));
//        System.out.println(SharedDigit.hasSharedDigit(15, 41));
//        System.out.println(SharedDigit.hasSharedDigit(15, 54));
//        System.out.println(SharedDigit.hasSharedDigit(17, 54));

//        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
//        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
//        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
//        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 34));
//
//        System.out.println("*********");
//        System.out.println(LastDigitChecker.isValid(10));
//        System.out.println(LastDigitChecker.isValid(468));
//        System.out.println(LastDigitChecker.isValid(1051));

        //Greatest Common Divisor
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));

        //All factors
//        AllFactors.printFactors(6);
//        AllFactors.printFactors(32);
//        AllFactors.printFactors(10);
//        AllFactors.printFactors(-1);

        //Perfect number
//        System.out.println(AllFactors.isPerfectNumber(6));
//        System.out.println(AllFactors.isPerfectNumber(28));
//        System.out.println(AllFactors.isPerfectNumber(5));
//        System.out.println(AllFactors.isPerfectNumber(-1));

        //Number to Words
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

        System.out.println("Get Digit");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));

        System.out.println("Reverse");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(2121));
        System.out.println(NumberToWords.reverse(4321));
        System.out.println(NumberToWords.reverse(1));
      }

}
