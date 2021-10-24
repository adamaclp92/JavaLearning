package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "Otthon", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "Munkahely", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "Szülőknél", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "Távol", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "Külföld", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "Kirándulni", tempExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1){
                String[] directionArray = direction.split(" ");

                for(String splittedWord : directionArray){
                    if(vocabulary.containsKey(splittedWord)){
                        direction = vocabulary.get(splittedWord);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("You cannot go in that direction.");
            }
        }

//        String[] road = "Egyetemi oktatási rendszer keretein belül már elsajátítottam a web- és alkalmazásfejlesztés alapjait az Eszterházy Károly Egyetem Programtervező informatikus (FOSZ) szakán.".split(" ");
//        for(String i : road){
//            System.out.println(i);
//        }
    }
}
