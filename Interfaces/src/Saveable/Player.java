package Saveable;

import java.util.ArrayList;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> playerAttributes = new ArrayList<>();
            playerAttributes.add(this.name);
            playerAttributes.add("" + this.hitPoints);
            playerAttributes.add("" + this.strength);
            playerAttributes.add(this.weapon);
        return playerAttributes;
    }

    @Override
    public void read(ArrayList<String> playerAttributes) {
        if(playerAttributes != null && playerAttributes.size() > 0){
            /*for (int i = 0; i < playerAttributes.size(); i++) {
                System.out.println(playerAttributes.get(i));
            }*/

            this.name = playerAttributes.get(0);
            this.hitPoints = Integer.parseInt(playerAttributes.get(1));
            this.strength = Integer.parseInt(playerAttributes.get(2));
            this.weapon = playerAttributes.get(3);
        }else{
            System.out.println("A lista üres.");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
