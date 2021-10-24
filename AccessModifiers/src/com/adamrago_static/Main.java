package com.adamrago_static;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest fistInstance = new StaticTest("1st Instance");
//        System.out.println(fistInstance.getName() + " is instance number " + StaticTest.getNumInstance());  //mivel static a method az osztályban
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstance());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstance());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

        //A Main metódus static. Csak egy lehet belőle egy programon belül. És egy static metódus csak static cuccokkal tud együtt dolgozni a metóduson kívül. Ezért ha
        //használni akarjuk a multiply és multipliert, azoknak is staticnak kell lenni.

    }

    public static int multiply(int number){
        return number * multiplier;
    }

}
