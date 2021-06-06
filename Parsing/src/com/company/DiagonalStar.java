package com.company;

public class DiagonalStar {
    public static void  printSquareStar(int number){
        if(number < 5)
            System.out.println("Invalid Value");
        else{
            int i, j;
            for (i = 1; i <= number; i++){
                for(j = 1; j<= number; j++){
                    if(i == 1 || i == number)
                        System.out.print("*");
                    else if(j == number || j == 1)
                        System.out.print("*");
                    else if (j == i)
                        System.out.print("*");
                    else if(j == number+1 - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
