package com.company;

public class SwitchChar {
    public static void switchChar(char character){
        switch (character){
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C': case 'D': case 'E':
                System.out.println(character);
                break;

            default:
                System.out.println("not fount");
                break;
        }
    }
}
