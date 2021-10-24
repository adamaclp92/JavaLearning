package League;

public class Main {
    public static void main(String[] args) {
        FootballTeam inter = new FootballTeam("Inter Milan", 5, 2, 1, 2, 12, 10);
        FootballTeam juve = new FootballTeam("Juventus", 5, 3, 1, 1, 15, 7);
        FootballTeam milan = new FootballTeam("AC Milan", 5, 5, 0, 0, 19, 4);

        HandballTeam veszprem = new HandballTeam("MKB Veszprém", 6, 6, 0, 0, 200, 32);

        League<FootballTeam> serieA = new League<FootballTeam>("Serie A");


        System.out.println(serieA.numTeams());

        serieA.addTeam(inter);
        serieA.addTeam(juve);
        serieA.addTeam(milan);
        //serieA.addTeam(veszprem);


        serieA.showTable();
    }
}
