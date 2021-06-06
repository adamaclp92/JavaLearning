package com.company;

import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int numberOfArray){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[numberOfArray];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
            for (int i = 0; i < array.length-1; i++){
                for (int j = i+1; j < array.length; j++){
                    if(array[i] < array[j]) {
                        int c = array[i];
                        array[i] = array[j];
                        array[j] = c;
                    }
                }
            }

            return array;
    }
}
