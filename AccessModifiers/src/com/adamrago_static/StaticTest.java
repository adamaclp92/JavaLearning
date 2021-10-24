package com.adamrago_static;

public class StaticTest {
    private static int numInstance = 0;  //staticcal csak 1 db numInstance lesz az össes osztálypéldányhoz. Ha nincs static, akkor az összes osztály létrehoz magának külön.
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstance++;
    }

    public static int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }


}
