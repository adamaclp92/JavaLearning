package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //boolean first = true;

        while(true){
            System.out.println("Enter number:");
            boolean hashInt = scanner.hasNextInt();
            if(hashInt){
                int number = scanner.nextInt();

//                if(first){
//                    min = number;
//                    max = number;
//                    first = false;
//                }
                if(number < min){
                    min = number;
                }
                else if(number > max){
                    max = number;
                }
            }else
                break;

            scanner.nextLine();
        }
        System.out.println("The minimum number is: " + min + ", and the maximum number is: " + max);
        scanner.close();
    }
}
