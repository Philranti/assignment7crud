package za.ac.cput.projects.assignment7crud.domains.SoccerGame;

import java.util.Objects;

public class SoccerCareerLeague {
    private String careerType;
    private String teamCareerChosen;

    public SoccerCareerLeague() {
    }

    private SoccerCareerLeague(Builder builder) {
        this.careerType = builder.careerType;
        this.teamCareerChosen = builder.teamCareerChosen;
    }

    public String getCareerType() {
        return careerType;
    }

    public String getTeamCareerChosen() {
        return teamCareerChosen;
    }

    public static class Builder{

        private String careerType;
        private String teamCareerChosen;

        public Builder careerType(String careerType) {
            this.careerType = careerType;
            return this;
        }

        public Builder teamCareerChosen(String teamCareerChosen) {
            this.teamCareerChosen = teamCareerChosen;
            return this;
        }

        public SoccerCareerLeague build() {
            return new SoccerCareerLeague(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerCareerLeague that = (SoccerCareerLeague) o;
        return Objects.equals(careerType, that.careerType) &&
                Objects.equals(teamCareerChosen, that.teamCareerChosen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(careerType, teamCareerChosen);
    }

    @Override
    public String toString() {
        return "SoccerCareerLeague{" +
                "careerType='" + careerType + '\'' +
                ", teamCareerChosen='" + teamCareerChosen + '\'' +
                '}';
    }
}
