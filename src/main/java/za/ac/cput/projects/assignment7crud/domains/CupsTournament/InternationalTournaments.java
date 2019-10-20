package za.ac.cput.projects.assignment7crud.domains.CupsTournament;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class InternationalTournaments extends CupTournaments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "InternationalTournamentId",columnDefinition = "VARCHAR(100)",nullable=false)
    private String InternationalTournamentId;


    @GeneratedValue(strategy = GenerationType.AUTO)
    private String interTournamentName;


    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numOfInternationalTournaments;


    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numOfNationsParticipating;


    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nationWinner;

    public InternationalTournaments() {
    }

    private InternationalTournaments(Builder builder) {
        this.interTournamentName = builder.interTournamentName;
        this.numOfInternationalTournaments = builder.numOfInternationalTournaments;
        this.numOfNationsParticipating = builder.numOfNationsParticipating;
        this.nationWinner = builder.nationWinner;
        this.InternationalTournamentId = builder.internationalTournamentId;
    }

    public String getInternationalTournamentId() {
        return InternationalTournamentId;
    }

    public void setInternationalTournamentId(String internationalTournamentId) {
        InternationalTournamentId = internationalTournamentId;
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
        private String internationalTournamentId;
        private String interTournamentName;
        private int numOfInternationalTournaments;
        private int numOfNationsParticipating;
        private String nationWinner;

        public Builder internationalTournamentId(String internationalTournamentId){
            this.internationalTournamentId = internationalTournamentId;
            return this;
        }

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
            this.internationalTournamentId = international.InternationalTournamentId;
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
                Objects.equals(InternationalTournamentId, that.InternationalTournamentId) &&
                Objects.equals(interTournamentName, that.interTournamentName) &&
                Objects.equals(nationWinner, that.nationWinner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(InternationalTournamentId, interTournamentName, numOfInternationalTournaments, numOfNationsParticipating, nationWinner);
    }

    @Override
    public String
    toString() {
        return "InternationalTournaments{" +
                "InternationalTournamentId='" + InternationalTournamentId + '\'' +
                ", interTournamentName='" + interTournamentName + '\'' +
                ", numOfInternationalTournaments=" + numOfInternationalTournaments +
                ", numOfNationsParticipating=" + numOfNationsParticipating +
                ", nationWinner='" + nationWinner + '\'' +
                '}';
    }
}
