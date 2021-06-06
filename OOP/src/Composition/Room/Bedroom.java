package Composition.Room;

public class Bedroom {
    private String name;
    private Walle wall1;
    private Walle wall2;
    private Walle wall3;
    private Walle wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Walle wall1, Walle wall2, Walle wall3, Walle wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bad making");
        bed.make();
    }
}
