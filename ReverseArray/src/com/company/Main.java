package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tomb = new int[]{1, 2, 3, 4, 5, 6};

        //printArray(tomb);
        reverse(tomb);
        //printArray(tomb);


    }

    private static void reverse(int[] array){
        System.out.println(Arrays.toString(array));
        int first = 0;
        int last = array.length-1;

            while(first < last) {
                int c = array[first];
                array[first] = array[last];
                array[last] = c;
                first++;
                last--;
            }
        System.out.println(Arrays.toString(array));
    }

    private static void printArray(int[] array){
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
