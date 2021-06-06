package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;

        if(!isAlien)
            System.out.println("This is an alien!");
        else
            System.out.println("Not an alien");

        int myscore = 80;
        int topscore = 100;
        int secondscore = 60;

        if(myscore > secondscore && myscore < topscore)
            System.out.println("A kettő között vagyok");

        int a = 1;
        int b = 10;
        int c = 12;

        if(b > a || b > c)
            System.out.println("fasza");

        int num = isAlien ? 10 : 6;
        System.out.println(num);



        //Challenge!
        double szam1 = 20.00;
        double szam2 = 80.00;

        double sum = szam1+szam2;
        sum *= 100;
        sum %=40.00;
        boolean eredmeny = (sum == 0) ? true : false;

        System.out.println(eredmeny);

        if(!eredmeny)
            System.out.println("Got some reminder");

    }
}
