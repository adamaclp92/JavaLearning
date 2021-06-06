package Polymorphism.Cars;

public class Ford extends Cars{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford class: The engine is started";
    }

    @Override
    public String accelerate() {
        return "Ford class: Accelerating...";
    }

    @Override
    public String brake() {
        return "Ford class: Braking...";
    }
}
