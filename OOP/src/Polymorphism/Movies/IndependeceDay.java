package Polymorphism.Movies;

public class IndependeceDay extends Movie{
    public IndependeceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}
