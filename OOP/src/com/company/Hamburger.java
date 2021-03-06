package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price = 500;

    private String addition1Name;
    private double addition1Price = 0;

    private String addition2Name;
    private double addition2Price = 0;

    private String addition3Name;
    private double addition3Price = 0;

    private String addition4Name;
    private double addition4Price = 0;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        if(price > 0)
            this.price = price;
    }


    public void addHamburgerAddition1(String additionName, double additionPrice){
        this.addition1Name = additionName;
        if(additionPrice > 0)
            this.addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice){
        this.addition2Name = additionName;
        if(additionPrice > 0)
            this.addition2Price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice){
        this.addition3Name = additionName;
        if(additionPrice > 0)
            this.addition3Price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice){
        this.addition4Name = additionName;
        if(additionPrice > 0)
            this.addition4Price = additionPrice;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }
}
