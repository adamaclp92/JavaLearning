package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while(counter <= 10){
            System.out.println("Enter number #" + counter);
            boolean hashNextInt = scanner.hasNextInt();

            if(hashNextInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else{
                System.out.println("Unable to parse!");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of all numbers: " + sum);
        scanner.close();
    }
}
