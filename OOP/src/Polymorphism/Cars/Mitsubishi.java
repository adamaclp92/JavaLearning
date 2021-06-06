package Polymorphism.Cars;

public class Mitsubishi extends Cars{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi class: The engine is started";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi class: Accelerating...";
    }

    @Override
    public String brake() {
        return "Mitsubishi class: Braking...";
    }
}
