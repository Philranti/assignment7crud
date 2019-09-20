package za.ac.cput.projects.assignment7crud.domains.SoccerGame;

import java.util.Objects;

public class MasterLeague {
    private String masterLeagueName;
    private String teamChosen;

    public MasterLeague() {
    }

    private MasterLeague(Builder builder) {
        this.masterLeagueName = builder.masterLeagueName;
        this.teamChosen = builder.teamChosen;
    }

    public String getMasterLeagueName() {
        return masterLeagueName;
    }

    public String getTeamChosen() {
        return teamChosen;
    }

    public static class Builder{

        private String masterLeagueName;
        private String teamChosen;

        public Builder masterLeagueName(String masterLeagueName) {
            this.masterLeagueName = masterLeagueName;
            return this;
        }

        public Builder teamChosen(String teamChosen) {
            this.teamChosen = teamChosen;
            return this;
        }

        public MasterLeague build() {
            return new MasterLeague(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MasterLeague that = (MasterLeague) o;
        return Objects.equals(masterLeagueName, that.masterLeagueName) &&
                Objects.equals(teamChosen, that.teamChosen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(masterLeagueName, teamChosen);
    }

    @Override
    public String toString() {
        return "MasterLeague{" +
                "masterLeagueName='" + masterLeagueName + '\'' +
                ", teamChosen='" + teamChosen + '\'' +
                '}';
    }
}
