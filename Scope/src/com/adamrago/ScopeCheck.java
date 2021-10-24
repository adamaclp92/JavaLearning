package com.adamrago;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar); //ez a metódusban létrehozott változót használja
        }

    }

    public void timesTwoTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * this.varOne); //ez az osztály változóját használja a this miatt
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("toUseInner from outer class: " + innerClass.toUseInner);
    }

    public class InnerClass{
        //public int privateVar = 3;
        private int toUseInner = 10;
        public InnerClass() {
            System.out.println("InnerClass is created, privateVar is " + varOne);
        }
        public void timesTwo(){
          //  int privateVar = 2;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varOne); //ez a metódusban létrehozott változót használja
            }

        }


    }
}
