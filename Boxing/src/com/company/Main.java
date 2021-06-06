package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];



        //Nem lehet privitív típust megadni az ArrayList elemeihez, errort kapunk
        //ArrayList<int> intArrayList = new ArrayList<int>();

        //Stringgel azért működik, mert az lényegében egy osztály ctrl + bal egér a Stringre
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Adam");

        //így lehetne inteket kezelni ArrayListben, de ez egy kicsit bonyolult, hogy azért létrehozzunk egy osztályt
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Integer integer = new Integer(54);  //na ez már osztály
        //Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));  //Ez az autoboxing
        }

        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());  //ez az unboxing, mert itt megkapjuk a tényleges int értéket
        }

        Integer myIntValue = 56; //Integer.valueOf(56);   Elég csak az 56-ot kiírni, és az a valueOf-ot fogja rá elvégezni

        int myInt = myIntValue;  //myIntValue.intValue(); ez kerül ilyenkor elvégzésre

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl = 0.0; dbl < 10.0; dbl+= 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println(i + " --> " + myDoubleValues.get(i));
        }

    }
}
