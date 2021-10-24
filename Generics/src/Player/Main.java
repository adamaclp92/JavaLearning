package Player;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer kaká = new SoccerPlayer("Kaká");

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");  //így kell megadni, ha playerek közül is cska FootballPlayer jöhet
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPLayers());

        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Clubs");
        baseballTeam.addPlayer(pat);

        //Team<String> nemMuxik = new Team<String>("Asd"); Ez így már nem működik, és ez a jó

        Team<SoccerPlayer> milan = new Team<SoccerPlayer>("AC MILAN");
        milan.addPlayer(kaká);

        Team<SoccerPlayer> juve = new Team<SoccerPlayer>("Juventus");
        Team<SoccerPlayer> bayern = new Team<SoccerPlayer>("Bayern Munchen");
        Team<SoccerPlayer> barca = new Team<SoccerPlayer>("Barcelona");

        milan.matchResult(juve, 4, 2);
        bayern.matchResult(barca, 1, 1);

        barca.matchResult(milan, 1, 1);
        juve.matchResult(bayern, 2, 0);

        milan.matchResult(bayern, 5, 0);
        juve.matchResult(barca, 2, 2);


        System.out.println("Rankings");
        System.out.println(milan.getName() + ": " + milan.ranking());
        System.out.println(juve.getName() + ": " + juve.ranking());
        System.out.println(barca.getName() + ": " + barca.ranking());
        System.out.println(bayern.getName() + ": " + bayern.ranking());

        System.out.println(milan.compareTo(juve));

    }
}
