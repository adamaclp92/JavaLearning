package com.example.game;

import java.util.ArrayList;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> monsterAttributes = new ArrayList<>();
        monsterAttributes.add("name=" + this.name);
        monsterAttributes.add( "hitPoints=" + this.hitPoints);
        monsterAttributes.add( "strength=" + this.strength);
        return monsterAttributes;
    }

    @Override
    public void read(ArrayList<String> monsterAttributes) {
        if(monsterAttributes != null && monsterAttributes.size() > 0){
            for (int i = 0; i < monsterAttributes.size(); i++) {
                System.out.println(monsterAttributes.get(i));
            }
        }else{
            System.out.println("A lista üres.");
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
