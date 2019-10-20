package za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ChooseTeams {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teamId",columnDefinition = "VARCHAR(100)",nullable=false)
    private String teamId;


    @GeneratedValue(strategy = GenerationType.AUTO)
    private String chooseTeamA;


    @GeneratedValue(strategy = GenerationType.AUTO)
    private String chooseTeamB;


    public ChooseTeams() {
    }

    private ChooseTeams(Builder builder) {
        this.chooseTeamA = builder.chooseTeamA;
        this.chooseTeamB = builder.chooseTeamB;
        this.teamId = builder.teamId;
    }

    public String getChooseTeamA() {
        return chooseTeamA;
    }

    public String getChooseTeamB() {
        return chooseTeamB;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {

        this.teamId = teamId;
    }

    public void setChooseTeamA(String chooseTeamA) {
        this.chooseTeamA = chooseTeamA;
    }

    public void setChooseTeamB(String chooseTeamB) {
        this.chooseTeamB = chooseTeamB;
    }



    public static class Builder{

        private String chooseTeamA;
        private String chooseTeamB;
        private String teamId;

        public Builder chooseTeamA(String chooseTeamA) {
            this.chooseTeamA = chooseTeamA;
            return this;
        }

        public Builder chooseTeamB(String chooseTeamB) {
            this.chooseTeamB = chooseTeamB;
            return this;
        }

        public Builder teamId(String teamId){
            this.teamId = teamId;
            return this;
        }

        public ChooseTeams.Builder copy(ChooseTeams chooseTeams){
            this.chooseTeamA = chooseTeams.chooseTeamA;
            this.chooseTeamB = chooseTeams.chooseTeamB;
            this.teamId = chooseTeams.teamId;
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
        return Objects.equals(teamId, that.teamId) &&
                Objects.equals(chooseTeamA, that.chooseTeamA) &&
                Objects.equals(chooseTeamB, that.chooseTeamB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, chooseTeamA, chooseTeamB);
    }

    @Override
    public String toString() {
        return "ChooseTeams{" +
                "teamId=" + teamId +
                ", chooseTeamA='" + chooseTeamA + '\'' +
                ", chooseTeamB='" + chooseTeamB + '\'' +
                '}';
    }
}
