package za.ac.cput.projects.assignment7crud.domains.SoccerGame;

import java.util.Objects;

public class SoccerLeague {
    private String nameOfLeague;
    private int totalGames;
    private int numberOfTeams;

    public SoccerLeague() {
    }

    private SoccerLeague(Builder builder) {
        this.nameOfLeague = builder.nameOfLeague;
        this.totalGames = builder.totalGames;
        this.numberOfTeams = builder.numberOfTeams;
    }

    public String getNameOfLeague() {
        return nameOfLeague;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public static class Builder{

        private String nameOfLeague;
        private int totalGames;
        private int numberOfTeams;

        public Builder nameOfLeague(String nameOfLeague) {
            this.nameOfLeague = nameOfLeague;
            return this;
        }

        public Builder totalGames(int totalGames) {
            this.totalGames = totalGames;
            return this;
        }

        public Builder numberOfTeams(int numberOfTeams) {
            this.numberOfTeams = numberOfTeams;
            return this;
        }

        public SoccerLeague build() {
            return new SoccerLeague(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerLeague that = (SoccerLeague) o;
        return getTotalGames() == that.getTotalGames() &&
                getNumberOfTeams() == that.getNumberOfTeams() &&
                Objects.equals(getNameOfLeague(), that.getNameOfLeague());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameOfLeague(), getTotalGames(), getNumberOfTeams());
    }

    @Override
    public String toString() {
        return "SoccerLeague{" +
                "nameOfLeague='" + nameOfLeague + '\'' +
                ", totalGames=" + totalGames +
                ", numberOfTeams=" + numberOfTeams +
                '}';
    }
}
