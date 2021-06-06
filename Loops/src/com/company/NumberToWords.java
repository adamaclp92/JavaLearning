package com.company;

public class NumberToWords {
    private static final String INVALID_VALUE_MESSAGE  = "Invalid Value";
    public static void numberToWords(int number){
        int reverseNum = reverse(number);
        int constNum = number;

        number = reverse(number);
        if(number < 0)
            System.out.println(INVALID_VALUE_MESSAGE);
        else{
            while(number > 0){
                int lastDigit = number % 10;
                switch (lastDigit){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                number /= 10;
            }
            if(getDigitCount(constNum) != getDigitCount(reverseNum)){
                for(int i = getDigitCount(reverseNum); i < getDigitCount(constNum); i++)
                    System.out.print("Zero ");
            }
            System.out.println();
        }
    }

    public static int reverse(int number){
        if(number < 0)
            return -1;
        else{
            String stringNumber = "";

            while(number > 0){
                stringNumber += String.valueOf(number % 10);
                number /= 10;
            }
            return Integer.parseInt(stringNumber);
        }
    }

    public static int getDigitCount(int number){
        if(number == 0)
            return 1;
        if(number < 0)
            return -1;
        else{
            int count = 0;
            while(number > 0){
                count++;
                number /= 10;
            }
            return count;
        }
    }
}
