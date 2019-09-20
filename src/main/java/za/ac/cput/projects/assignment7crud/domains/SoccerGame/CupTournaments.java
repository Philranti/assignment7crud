package za.ac.cput.projects.assignment7crud.domains.SoccerGame;

//import java.util.Objects;

public class CupTournaments {
   private String nameOfTournament;
    private int numberOfTournaments;
    private int numberOfCupTeams;
    private String winner;
   // Set<CupTournaments> cupTournaments;

    public CupTournaments() {
    }

    private CupTournaments(Builder builder) {
        this.nameOfTournament = builder.nameOfTournament;
        this.numberOfTournaments = builder.numberOfTournaments;
        this.numberOfCupTeams = builder.numberOfCupTeams;
        this.winner = builder.winner;
    }

    public String getNameOfTournament() {
        return nameOfTournament;
    }

    public int getNumberOfTournaments() {
        return numberOfTournaments;
    }

    public int getNumberOfCupTeams() {
        return numberOfCupTeams;
    }

    public String getWinner() {
        return winner;
    }

    public static class Builder{

        private String nameOfTournament;
        private int numberOfTournaments;
        private int numberOfCupTeams;
        private String winner;

        public Builder nameOfTournament(String nameOfTournament) {
            this.nameOfTournament = nameOfTournament;
            return this;
        }

        public Builder numberOfTournaments(int numberOfTournaments) {
            this.numberOfTournaments = numberOfTournaments;
            return this;
        }


        public Builder numberOfCupTeams(int numberOfCupTeams) {
            this.numberOfCupTeams = numberOfCupTeams;
            return this;
        }

        public Builder winner(String winner) {
            this.winner = winner;
            return this;
        }

        public CupTournaments build() {
            return new CupTournaments(this);
        }



        @Override
        public String toString() {
            return "Builder{" +
                    "nameOfTournament='" + nameOfTournament + '\'' +
                    ", numberOfTournaments=" + numberOfTournaments +
                    ", numberOfCupTeams=" + numberOfCupTeams +
                    ", winner='" + winner + '\'' +
                    '}';
        }
    }

    

    
}
