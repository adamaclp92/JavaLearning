package League;

public abstract class Teams implements Comparable<Teams>{
    private String name;
    private int points;
    private int matchPlayed;
    private int wins;
    private int draws;
    private int loses;
    private int scoredGoals;
    private int getGoals;

    public Teams(String name, int matchPlayed, int wins, int draws, int loses, int scoredGoals, int getGoals) {
        this.name = name;
        this.matchPlayed = matchPlayed;
        this.wins = wins;
        this.draws = draws;
        this.loses = loses;
        this.scoredGoals = scoredGoals;
        this.getGoals = getGoals;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points();
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLoses() {
        return loses;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public int getGetGoals() {
        return getGoals;
    }

    public int points(){
        this.points = this.wins * 3 + this.draws;
        return this.points;
    }

    @Override
    public int compareTo(Teams team) {
        if(this.points() < team.points()){
            return 1;
        }else if(this.points() == team.points()){
            return 0;
        }else
            return -1;
    }
}
