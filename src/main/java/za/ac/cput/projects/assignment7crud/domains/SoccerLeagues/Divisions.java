package za.ac.cput.projects.assignment7crud.domains.SoccerLeagues;

import java.util.Objects;

public class Divisions {
    private String divisionPlayed;
    private int numOfTeams;
    private String currentChampions;

    public Divisions() {
    }

    private Divisions(Builder builder) {
        this.divisionPlayed = builder.divisionPlayed;
        this.numOfTeams = builder.numOfTeams;
        this.currentChampions = builder.currentChampions;

    }

    public String getDivisionPlayed() {
        return divisionPlayed;
    }


    public int getNumOfTeams() {
        return numOfTeams;
    }

    public String getCurrentChampions() {
        return currentChampions;
    }

    public static class Builder{

        private String divisionPlayed;
        private int numOfTeams;
        private String currentChampions;


        public Builder divisionPlayed(String divisionPlayed) {
            this.divisionPlayed = divisionPlayed;
            return this;
        }



        public Builder numOfTeams(int numOfTeams) {
            this.numOfTeams = numOfTeams;
            return this;
        }

        public Builder currentChampions(String currentChampions) {
            this.currentChampions = currentChampions;
            return this;
        }


        public Divisions build() {
            return new Divisions(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Divisions divisions = (Divisions) o;
        return divisionPlayed == divisions.divisionPlayed &&
                numOfTeams == divisions.numOfTeams &&
                Objects.equals(currentChampions, divisions.currentChampions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(divisionPlayed, numOfTeams, currentChampions);
    }

    @Override
    public String toString() {
        return "Divisions{" +
                "divisionPlayed=" + divisionPlayed +
                ", numOfTeams=" + numOfTeams +
                ", currentChampions='" + currentChampions + '\'' +
                '}';
    }
}
