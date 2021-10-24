package Gearbox;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        System.out.println(mcLaren.isClutchIsIn());;
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.operateClutch(false);
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        //Gearbox.Gear second = mcLaren.new Gear(2, 15.8);
       // System.out.println(Gear.driveSpeed(1000));

        //Egy mcLaren object sebességváltójának több fokozata van
        //minden egyes Gear, a mcLaren-hez tartozó fokozat




    }
}
