package Polymorphism.Cars;

public class Holden extends Cars {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden class: The engine is started";
    }

    @Override
    public String accelerate() {
        return "Holden class: Accelerating...";
    }

    @Override
    public String brake() {
        return "Holden class: Braking...";
    }
}
