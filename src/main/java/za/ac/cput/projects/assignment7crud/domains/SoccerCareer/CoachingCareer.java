package za.ac.cput.projects.assignment7crud.domains.SoccerCareer;


import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;

public class CoachingCareer extends SoccerCareerLeague {

    private int yearsCoached;
    private int leagueTrophies;
    private int cupTrophies;
    private int internationalTrophies;

    private CoachingCareer(Builder builder) {
        this.yearsCoached = builder.yearsCoached;
        this.leagueTrophies = builder.leagueTrophies;
        this.cupTrophies = builder.cupTrophies;
        this.internationalTrophies = builder.internationalTrophies;

    }

    public int getYearsCoached() {
        return yearsCoached;
    }



    public int getLeagueTrophies() {
        return leagueTrophies;
    }

    public int getCupTrophies() {
        return cupTrophies;
    }

    public int getInternationalTrophies() {
        return internationalTrophies;
    }

    public static class Builder{

        private int yearsCoached;
        private int numOfTrophiesWon;
        private int leagueTrophies;
        private int cupTrophies;
        private int internationalTrophies;

        public Builder yearsCoached(int yearsCoached) {
            this.yearsCoached = yearsCoached;
            return this;
        }



        public Builder leagueTrophies(int leagueTrophies) {
            this.leagueTrophies = leagueTrophies;
            return this;
        }

        public Builder cupTrophies(int cupTrophies) {
            this.cupTrophies = cupTrophies;
            return this;
        }

        public Builder internationalTrophies(int internationalTrophies) {
            this.internationalTrophies = internationalTrophies;
            return this;
        }



        public CoachingCareer build() {
            return new CoachingCareer(this);
        }

    }

    @Override
    public String toString() {
        return "CoachingCareer{" +
                "yearsCoached=" + yearsCoached +
                ", leagueTrophies=" + leagueTrophies +
                ", cupTrophies=" + cupTrophies +
                ", internationalTrophies=" + internationalTrophies +
                '}';
    }
}
