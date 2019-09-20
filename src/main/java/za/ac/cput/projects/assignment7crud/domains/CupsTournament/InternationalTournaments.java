package za.ac.cput.projects.assignment7crud.domains.CupsTournament;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;

import java.util.Objects;

public class InternationalTournaments extends CupTournaments {
    private String interTournamentName;
    private int numOfInternationalTournaments;
    private int numOfNationsParticipating;
    private String nationWinner;

    public InternationalTournaments() {
    }

    private InternationalTournaments(Builder builder) {
        this.interTournamentName = builder.interTournamentName;
        this.numOfInternationalTournaments = builder.numOfInternationalTournaments;
        this.numOfNationsParticipating = builder.numOfNationsParticipating;
        this.nationWinner = builder.nationWinner;
    }

    public String getInterTournamentName() {
        return interTournamentName;
    }

    public int getNumOfInternationalTournaments() {
        return numOfInternationalTournaments;
    }

    public int getNumOfNationsParticipating() {
        return numOfNationsParticipating;
    }

    public String getNationWinner() {
        return nationWinner;
    }

    public static class Builder{

        private String interTournamentName;
        private int numOfInternationalTournaments;
        private int numOfNationsParticipating;
        private String nationWinner;

        public Builder interTournamentName(String interTournamentName) {
            this.interTournamentName = interTournamentName;
            return this;
        }

        public Builder numOfInternationalTournaments(int numOfInternationalTournaments) {
            this.numOfInternationalTournaments = numOfInternationalTournaments;
            return this;
        }

        public Builder numOfNationsParticipating(int numOfNationsParticipating) {
            this.numOfNationsParticipating = numOfNationsParticipating;
            return this;
        }

        public Builder nationWinner(String nationWinner) {
            this.nationWinner = nationWinner;
            return this;
        }

        public InternationalTournaments.Builder copy(InternationalTournaments international){
            this.interTournamentName = international.interTournamentName;
            this.numOfInternationalTournaments = international.numOfInternationalTournaments;
            this.numOfNationsParticipating = international.numOfNationsParticipating;
            this.nationWinner = international.nationWinner;
            return this;
        }

        public InternationalTournaments build() {
            return new InternationalTournaments(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InternationalTournaments that = (InternationalTournaments) o;
        return numOfInternationalTournaments == that.numOfInternationalTournaments &&
                numOfNationsParticipating == that.numOfNationsParticipating &&
                Objects.equals(interTournamentName, that.interTournamentName) &&
                Objects.equals(nationWinner, that.nationWinner);
    }

    @Override
    public int hashCode() {

        return Objects.hash(interTournamentName, numOfInternationalTournaments, numOfNationsParticipating, nationWinner);
    }

    @Override
    public String toString() {
        return "InternationalTournaments{" +
                "interTournamentName='" + interTournamentName + '\'' +
                ", numOfInternationalTournaments=" + numOfInternationalTournaments +
                ", numOfNationsParticipating=" + numOfNationsParticipating +
                ", nationWinner='" + nationWinner + '\'' +
                '}';
    }
}
