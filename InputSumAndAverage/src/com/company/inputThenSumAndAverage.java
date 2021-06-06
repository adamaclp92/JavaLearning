package com.company;

import java.util.Scanner;

public class inputThenSumAndAverage {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0.0;
        while(true){
            boolean hashInt = scanner.hasNextInt();
            if(hashInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

        avg = (double)sum / count;
        int avg2 = (int)Math.round(avg);
        System.out.println("SUM = " + sum + " AVG = " + avg2);
    }
}
