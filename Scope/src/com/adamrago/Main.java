package com.adamrago;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getVarOne());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println();
        scopeInstance.timesTwoTwo();

        System.out.println("******************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        scopeInstance.useInner();
        ScopeCheck.InnerClass innerClass1 = scopeInstance.new InnerClass();
        //System.out.println(innerClass1.toUseInner); így nem lehet elérni, mert private a változó

    }
}
