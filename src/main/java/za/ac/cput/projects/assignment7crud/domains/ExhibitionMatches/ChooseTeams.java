package za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches;

import java.util.Objects;

public class ChooseTeams {
    private String chooseTeamA;
    private String chooseTeamB;

    public ChooseTeams() {
    }

    private ChooseTeams(Builder builder) {
        this.chooseTeamA = builder.chooseTeamA;
        this.chooseTeamB = builder.chooseTeamB;
    }

    public String getChooseTeamA() {
        return chooseTeamA;
    }

    public String getChooseTeamB() {
        return chooseTeamB;
    }

    public static class Builder{

        private String chooseTeamA;
        private String chooseTeamB;

        public Builder chooseTeamA(String chooseTeamA) {
            this.chooseTeamA = chooseTeamA;
            return this;
        }

        public Builder chooseTeamB(String chooseTeamB) {
            this.chooseTeamB = chooseTeamB;
            return this;
        }

        public ChooseTeams.Builder copy(ChooseTeams chooseTeams){
            this.chooseTeamA = chooseTeams.chooseTeamA;
            this.chooseTeamB = chooseTeams.chooseTeamB;
            return this;
        }

        public ChooseTeams build() {
            return new ChooseTeams(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChooseTeams that = (ChooseTeams) o;
        return Objects.equals(chooseTeamA, that.chooseTeamA) &&
                Objects.equals(chooseTeamB, that.chooseTeamB);
    }

    @Override
    public int hashCode() {

        return Objects.hash(chooseTeamA, chooseTeamB);
    }

    @Override
    public String toString() {
        return "ChooseTeams{" +
                "chooseTeamA='" + chooseTeamA + '\'' +
                ", chooseTeamB='" + chooseTeamB + '\'' +
                '}';
    }
}
