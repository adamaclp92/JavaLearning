package Inheritance;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chewing");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
        chew();

    }

    public void walk(){
        System.out.println("Dog walking");
        move(5);
    }

    public void run(){
        System.out.println("Dog running");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog move legs at " + speed );
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog moving at " + speed);
        moveLegs(speed);
        super.move(speed);
    }


}
