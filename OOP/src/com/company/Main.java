package com.company;

import Composition.PC.*;
import Composition.Room.*;
import Constructors.ComplexNumber;
import Constructors.Wall;
import Encapsulation.Player.Player;
import Encapsulation.Printer.Printer;
import Inheritance.Animal;
import Inheritance.Cylinder.Circle;
import Inheritance.Cylinder.Cylinder;
import Inheritance.Dog;
import Inheritance.PoolArea.Cuboid;
import Inheritance.PoolArea.Rectangle;
import Inheritance.Vehicle.Outlander;
import Polymorphism.Cars.*;
import Polymorphism.Movies.Forgettable;
import Polymorphism.Movies.IndependeceDay;
import Polymorphism.Movies.Jaws;
import Polymorphism.Movies.Movie;

import javax.swing.*;
import java.sql.SQLOutput;



public class Main {

    public static void main(String[] args) {
        //Car
//	    Car porsche = new Car();
//        porsche.setModel("Carrera");
//        System.out.println("The model is: " + porsche.getModel());
//        porsche.setModel("922");
//        System.out.println("The model is: " + porsche.getModel());

        //SimpleCalculator
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("substract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        //Person
//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullname= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullname= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullname= " + person.getFullName());

        //Bankaccount
        /*BankAccount account = new BankAccount(1234, 1000000, "Ádám", "adamaclp92@gmail.com", "+3620/463-1698");
        account.setBalance(1000000);
        account.setAccountNumber(1234);
        account.setCustomerName("Ádám");
        account.setEmail("adamaclp92@gmail.com");
        account.setPhoneNumber("+3620/463-1698");
        //account.depositFunds(-200000);
        account.withdrawFunds(300000);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account name: " + account.getCustomerName());
        System.out.println("Account email: " + account.getEmail());
        System.out.println("Account phone number: " + account.getPhoneNumber());
        System.out.println("Account balance: " + account.getBalance());

        System.out.println();
        BankAccount defaultAccount = new BankAccount();
        System.out.println("Account number: " + defaultAccount.getAccountNumber());
        System.out.println("Account name: " + defaultAccount.getCustomerName());
        System.out.println("Account email: " + defaultAccount.getEmail());
        System.out.println("Account phone number: " + defaultAccount.getPhoneNumber());
        System.out.println("Account balance: " + defaultAccount.getBalance());

        System.out.println();
        BankAccount adamAccount = new BankAccount("Adam", "adamaclp@gmail.com", "0630123456");
        System.out.println("Account number: " + adamAccount.getAccountNumber());
        System.out.println("Account name: " + adamAccount.getCustomerName());
        System.out.println("Account email: " + adamAccount.getEmail());
        System.out.println("Account phone number: " + adamAccount.getPhoneNumber());
        System.out.println("Account balance: " + adamAccount.getBalance());*/

        //Vipcustomer
       /* VipCustomer vip1 = new VipCustomer();
        System.out.println("Name: " + vip1.getName());
        System.out.println("Credit limit: " + vip1.getCreditLimit());
        System.out.println("Email: " + vip1.getEmail());
        System.out.println();

        VipCustomer vip2 = new VipCustomer("Kiss Jenő", 150.0);
        System.out.println("Name: " + vip2.getName());
        System.out.println("Credit limit: " + vip2.getCreditLimit());
        System.out.println("Email: " + vip2.getEmail());
        System.out.println();

        VipCustomer vip3 = new VipCustomer("Ragó Ádám", 200.0, "adam@adam.hu");
        System.out.println("Name: " + vip3.getName());
        System.out.println("Credit limit: " + vip3.getCreditLimit());
        System.out.println("Email: " + vip3.getEmail());

        System.out.println();
        VipCustomer vip4 = new VipCustomer("Nagy Botond", -5);
        System.out.println("Name: " + vip4.getName());
        System.out.println("Credit limit: " + vip4.getCreditLimit());
        System.out.println("Email: " + vip4.getEmail());*/

        //Wall
        /*Wall v1 = new Wall();
        v1.setWidth(10.5);
        v1.setHeight(12.5);
        System.out.println("Width: " + v1.getWidth());
        System.out.println("Height " + v1.getHeight());
        System.out.println("Area is: " + v1.getArea());
        System.out.println();

        Wall wall = new Wall(-5, 4);
        System.out.println("Area is: " + wall.getArea());
        System.out.println();

        wall.setHeight(-1.5);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height " + wall.getHeight());
        System.out.println("Area is: " + wall.getArea());*/

        //Point
        /*Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0, 0)= " + first.distance());
        System.out.println("distance(second)= " + second.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance= " + point.distance());*/

        //Floor and Carpet and Calculator
      /*  Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total: " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total: " + calculator.getTotalCost());*/

        //ComplexNumber
        /*ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one real= " + one.getReal());
        System.out.println("one imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one real= " + one.getReal());
        System.out.println("one imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number real= " + number.getReal());
        System.out.println("number imaginary= " + number.getImaginary());*/

        //INHERITANCE

        //Animal
       /* Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        //dog.walk();
        dog.run();*/

        //Car
        /*Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(-25);*/

        //Cylinder
        /*Circle circle = new Circle(3.75);
        System.out.println("circle radius: " + circle.getRadius());
        System.out.println("circle area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder radius: " + cylinder.getRadius());
        System.out.println("cylinder height: " + cylinder.getHeight());
        System.out.println("cylinder area: " + cylinder.getArea());
        System.out.println("cylinder volume: " + cylinder.getVolume());*/

        //Pool Area
       /* Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Cuboid width: " + cuboid.getWidth());
        System.out.println("Cuboid length: " + cuboid.getLength());
        System.out.println("Cuboid area: " + cuboid.getArea());
        System.out.println("Cuboid height: " + cuboid.getHeight());
        System.out.println("Cuboid volume: " + cuboid.getVolume());*/

    //Composition
        //PC
       /* Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440)); //paraméterben is lehet osztályt példányosítani

        Motherboard theMotherboard = new Motherboard("83-200", "Asus", 4, "v2.44");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);
       thePc.powerUp();*/


        //Room
       /* Walle wall1 = new Walle("West");
        Walle wall2 = new Walle("East");
        Walle wall3 = new Walle("South");
        Walle wall4 = new Walle("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Adam", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();*/

       //ENCAPSULATION
        //Player
        /*Player player = new Player("Adam", 150, "Sword");
        System.out.println("Initial health is: " + player.healthRemaining());


        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        int damage2= 11;
        player.loseHealth(damage2);
        System.out.println("Remaining health = " + player.healthRemaining());*/

        //Printer
        /*Printer printer = new Printer(50, true);
        System.out.println("Initial page count= " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for a printer: " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for a printer: " + printer.getPagesPrinted());*/

        //Polymorphism
        //Movie
        /*for (int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }*/


        //Cars
        /*for (int i = 1; i < 11; i++){
            Cars cars = randomCar();
            System.out.println("Car #" + i + ": " + cars.getName() + "\n"
            + cars.startEngine() + "\n");
        }*/

        //Cars
        /*Cars cars = new Cars(8, "Base Car");
        System.out.println(cars.startEngine());
        System.out.println(cars.accelerate());
        System.out.println(cars.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford= new Ford(6, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());*/

        //Bill's burgers
        Hamburger csibe = new Hamburger("Csibe", "Csirke", 600, "Szezámmagos");
        csibe.addHamburgerAddition1("uborka", -200);
        csibe.addHamburgerAddition1("hagyma", -200);
        csibe.addHamburgerAddition3("majonéz", 1);
        System.out.println("Fizetendő összeg: " + csibe.itemizeHamburger());

        System.out.println();

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.addHamburgerAddition3("asd", 100);
        System.out.println("Fizetendő összeg: " + deluxe.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Fizetendő összeg: " + healthyBurger.itemizeHamburger());

    }
        //Polymorphism
    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random()*3)+1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependeceDay();

            default:
                return new Forgettable();
        }

    }

    public static Cars randomCar(){
        int randomNumber = (int)(Math.random()*2)+1;
        System.out.println("Random number generated was: " + randomNumber);

        switch(randomNumber){
            case 1:
                return new Skoda();
            default:
                return new AnotherCar();
        }
    }
}
