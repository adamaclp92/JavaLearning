package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("Ez az én stringem: " + myString);
        myString += " \u00A9 2021";
        System.out.println("Ez az én stringem: " + myString);
    }
}
