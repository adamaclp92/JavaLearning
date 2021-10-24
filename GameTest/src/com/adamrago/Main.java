package com.adamrago;

import com.example.game.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Adam", 10, 10);
        System.out.println(player.toString());
        ArrayList<String> playerlista = player.write();
        player.read(playerlista);

        System.out.println();

        ISaveable monster = new Monster("Hulk", 20, 20);
        System.out.println(monster.toString());
        System.out.println(((Monster) monster).getStrength());
        ArrayList<String> monsterlista = monster.write();
        monster.read(monsterlista);
    }
}
