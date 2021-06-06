package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


	    int[] array = readElements(readInteger());
        System.out.println("A tömb legkisebb eleme: " + findMin(array));

    }

    private static int readInteger(){
        System.out.println("Add meg a darabszámot: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        int[] array = new int[count];
        System.out.println("Adj meg " + count + " db számot:");

        for (int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
