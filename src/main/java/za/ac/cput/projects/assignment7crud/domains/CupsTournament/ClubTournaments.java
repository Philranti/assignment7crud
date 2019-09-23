package za.ac.cput.projects.assignment7crud.domains.CupsTournament;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;

import java.util.Objects;


public class ClubTournaments {
    private String clubTournamentName;
    private int teamsParticipating;
    private String clubWinner;

    private ClubTournaments() {
    }

    private ClubTournaments(Builder builder) {
        this.clubTournamentName = builder.clubTournamentName;
        this.teamsParticipating = builder.teamsParticipating;
        this.clubWinner = builder.clubWinner;
    }

    public String getClubTournamentName() {
        return clubTournamentName;
    }

    public int getTeamsParticipating() {
        return teamsParticipating;
    }

    public String getClubWinner() {
        return clubWinner;
    }

    public void setClubTournamentName(String clubTournamentName) {
        this.clubTournamentName = clubTournamentName;

    }

    public void setTeamsParticipating(int teamsParticipating) {
        this.teamsParticipating = teamsParticipating;
    }

    public void setClubWinner(String clubWinner) {
        this.clubWinner = clubWinner;
    }



    public static class Builder{

        private String clubTournamentName;
        private int teamsParticipating;
        private String clubWinner;


        public Builder clubTournament(String clubTournamentName) {
            this.clubTournamentName = clubTournamentName;
            return this;
        }

        public Builder teamsParticipating(int teamsParticipating) {
            this.teamsParticipating = teamsParticipating;
            return this;
        }

        public Builder clubWinner(String clubWinner) {
            this.clubWinner = clubWinner;
            return this;
        }

        public ClubTournaments.Builder copy(ClubTournaments clubTournaments){
            this.clubTournamentName = clubTournaments.clubTournamentName;
            this.teamsParticipating = clubTournaments.teamsParticipating;
            this.clubWinner = clubTournaments.clubWinner;
            return this;
        }

        public ClubTournaments build()
        {
            return new ClubTournaments(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubTournaments that = (ClubTournaments) o;
        return Objects.equals(clubTournamentName, that.clubTournamentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubTournamentName);
    }

    @Override
    public String toString() {
        return "ClubTournaments{" +
                "clubTournamentName='" + clubTournamentName + '\'' +
                ", teamsParticipating=" + teamsParticipating +
                ", clubWinner='" + clubWinner + '\'' +
                '}';
    }
}
