package Polymorphism.Cars;

public class Cars {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Cars(int cylinders, String name) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car class: The engine is started";
    }

    public String accelerate(){
        return "Car class: Accelerating...";
    }

    public String brake(){
        return "Car class: Braking...";
    }
}
