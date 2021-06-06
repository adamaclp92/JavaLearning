package com.company;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - yearOfBirth;

            if(age > 0 && age < 100){
                System.out.println("Hi, " + name + "! Your age is: " + age);
            }else
                System.out.println("Invalid year of birth!");

        }else
            System.out.println("Unable to parse year of birth!");



        scanner.close();
    }
}
