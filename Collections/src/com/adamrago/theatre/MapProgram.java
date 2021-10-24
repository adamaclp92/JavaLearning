package com.adamrago.theatre;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented language.");
        languages.put("C#", "Object oriented, high level");
        languages.put("Python", "Interpreted, object-oriented, high level");
        languages.put("C", "Innen indult minden");

        System.out.println(languages.get("Java"));


        if(languages.containsKey("Java")){
            System.out.println("Már benne van a Java");
        }

       // languages.remove("C");

        if(languages.remove("Python", "Interpreted, object-oriented, high level")){
            System.out.println("Python removed");
        }else{
            System.out.println("Python not removed, key/value pair not found");
        }

        //System.out.println(languages.replace("C", "sddsadasds"));
        if(languages.replace("C", "Innen indult minden", "ez lett belőle")){
            System.out.println("C replaced");
        }else{
            System.out.println("C not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
