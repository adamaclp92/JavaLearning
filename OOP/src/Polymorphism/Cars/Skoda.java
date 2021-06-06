package Polymorphism.Cars;

public class Skoda extends Cars{
    public Skoda() {
        super(4, "Skoda");
    }

    @Override
    public String startEngine() {
        return super.getName() + " start engine";
    }

    @Override
    public String accelerate() {
        return super.getName() + " accelerating...";
    }

    @Override
    public String brake() {
        return super.getName() + " braking..";
    }
}
