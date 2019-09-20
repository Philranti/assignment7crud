package za.ac.cput.projects.assignment7crud.domains.SoccerCareer;

import java.util.Objects;

public class PlayerCareer {
    private String teamCareer;
    private int yearsPlayed;
    private int matchesPlayed;
    private int goals;
    private int assist;

    public PlayerCareer() {
    }

    private PlayerCareer(Builder builder) {
        this.teamCareer = builder.teamCareer;
        this.yearsPlayed = builder.yearsPlayed;
        this.matchesPlayed = builder.matchesPlayed;
        this.goals = builder.goals;
        this.assist = builder.assist;

    }

    public String getTeamCareer() {
        return teamCareer;
    }

    public int getYearsPlayed() {
        return yearsPlayed;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssist() {
        return assist;
    }

    public static class Builder{

        private String teamCareer;
        private int yearsPlayed;
        private int matchesPlayed;
        private int goals;
        private int assist;

        public Builder teamCareer(String teamCareer) {
            this.teamCareer = teamCareer;
            return this;
        }

        public Builder yearsPlayed(int yearsPlayed) {
            this.yearsPlayed = yearsPlayed;
            return this;
        }

        public Builder matchesPlayed(int matchesPlayed) {
            this.matchesPlayed = matchesPlayed;
            return this;
        }

        public Builder goals(int goals) {
            this.goals = goals;
            return this;
        }

        public Builder assist(int assist) {
            this.assist = assist;
            return this;
        }



        public PlayerCareer build() {
            return new PlayerCareer(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerCareer that = (PlayerCareer) o;
        return matchesPlayed == that.matchesPlayed &&
                goals == that.goals &&
                assist == that.assist &&
                Objects.equals(teamCareer, that.teamCareer) &&
                Objects.equals(yearsPlayed, that.yearsPlayed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teamCareer, yearsPlayed, matchesPlayed, goals, assist);
    }

    @Override
    public String toString() {
        return "PlayerCareer{" +
                "teamCareer='" + teamCareer + '\'' +
                ", yearsPlayed='" + yearsPlayed + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", goals=" + goals +
                ", assist=" + assist +
                '}';
    }
}
