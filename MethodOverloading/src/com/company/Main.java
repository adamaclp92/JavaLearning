package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

      //Score calculation
      CalculateScore.calculateScore("Adam", 100);
      CalculateScore.calculateScore(50);

      //Feet and inches to centimeters
      System.out.println();
      FeetAndInchesCalc.calcFeetAndInchesToCentimeters(-1);
      FeetAndInchesCalc.calcFeetAndInchesToCentimeters(100);
      FeetAndInchesCalc.calcFeetAndInchesToCentimeters(12, 9);
      FeetAndInchesCalc.calcFeetAndInchesToCentimeters(8, 4);

      //Duration calculator
        System.out.println();
        System.out.println(SecondsAndMinutes.getDurationString(180, 50));
        System.out.println(SecondsAndMinutes.getDurationString(-1, 40));
        System.out.println(SecondsAndMinutes.getDurationString(180, 66));
        System.out.println(SecondsAndMinutes.getDurationString(289, 42));

        System.out.println();
        System.out.println(SecondsAndMinutes.getDurationString(5000));
        System.out.println(SecondsAndMinutes.getDurationString(-10));

      //AreaCalculator
      System.out.println();
      System.out.println(AreaCalculator.area(5.0));
      System.out.println(AreaCalculator.area(-1));
      System.out.println(AreaCalculator.area(5.0, 4.0));
      System.out.println(AreaCalculator.area(-1.0, 4.0));

      //Minutes to Years and Days
      System.out.println();
      MinutesToYearsAndDays.printYearsAndDays(525600);
      MinutesToYearsAndDays.printYearsAndDays(1051200);
      MinutesToYearsAndDays.printYearsAndDays(561600);

      //Equality printer
      System.out.println();
      EqualityPrinter.printEqual(1,1,1);
      EqualityPrinter.printEqual(1,1,2);
      EqualityPrinter.printEqual(-1,-1,-1);
      EqualityPrinter.printEqual(1,2,3);

      //Playing cat
      System.out.println();
      System.out.println(PlayingCat.isCatPlaying(true, 10));
      System.out.println(PlayingCat.isCatPlaying(false, 36));
      System.out.println(PlayingCat.isCatPlaying(false, 35));
      System.out.println(PlayingCat.isCatPlaying(true, 44));
    }
}
