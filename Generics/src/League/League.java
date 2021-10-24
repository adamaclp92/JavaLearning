package League;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Teams> {
    private String name;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ArrayList<T> teams = new ArrayList<>();

    public int numTeams(){
        return this.teams.size();
    }

    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println("Már tartalmazza a csapatot.");
            return false;
        }else{
            teams.add(team);
            System.out.println(team.getName() + " hozzáadva a ligához.");
            return true;
        }
    }

    public void showTable(){
        System.out.println();
        System.out.println("Rank\tName\t\tPts.\tWins\tDraws\tLoss");
        System.out.println("-------------------------------------------------");
        int rank = 1;

        Collections.sort(teams);

        for (T t : teams) {
            System.out.println(rank + "." + "\t\t" + t.getName() + "\t " + t.getPoints() + "\t\t " + t.getWins() + "\t\t  " + t.getDraws() + "\t\t " + t.getLoses());

            rank++;
        }


    }
}


