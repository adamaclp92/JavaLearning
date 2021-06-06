package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Tömb feltöltése 0-90,ig 10-essével és kiíratás
        /*int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i * 10;
        }
        printArray(myArray);
        */


       /* printArray(getIntegers(5));
        System.out.println("A tömb elemeinek átlaga: " + getAverage(getIntegers(5)));*/

        //SortedArray
        /*int[] tomb = SortedArray.getIntegers(5);
        SortedArray.printArray(tomb);
        SortedArray.sortIntegers(tomb);
        SortedArray.printArray(tomb);*/

        //Érték és referenciatípusok
       /* int a = 10;
        int b = a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a++;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println();

        int[] array = new int[5];
        int[] array2 = array;

        System.out.println("array: " + Arrays.toString(array));  //értékadás nélkül 0 minden elem értéke (számítpusoknak)
        System.out.println("array2: " + Arrays.toString(array2));

        array[0] = 124;

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("array2: " + Arrays.toString(array2));
        //Megváltozott mindkettőnél az érték, mert referenciatípusok, szóval ugyanarra a helyre mutatnak*/


    }

    //Tömb kiíratás
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + (int)(i+1) + " is " + array[i]);
        }
    }

    //felhasználó adja meg a tömbelemeket
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " int values.\r");
        int [] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //Átlagszámítás a tömbelemeknek
    public static double getAverage(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double)sum/(double) array.length;
    }

}
