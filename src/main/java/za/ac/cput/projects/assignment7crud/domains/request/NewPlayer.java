package za.ac.cput.projects.assignment7crud.domains.request;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class NewPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "playerId",columnDefinition = "VARCHAR(100)",nullable=false)
    private String playerId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String  email;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String lastName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String newGameName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tournamentType;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String chosenTeam;

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewGameName() {
        return newGameName;
    }

    public void setNewGameName(String newGameName) {
        this.newGameName = newGameName;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public String getChosenTeam() {
        return chosenTeam;
    }

    public void setChosenTeam(String chosenTeam) {
        this.chosenTeam = chosenTeam;
    }



    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewPlayer newPlayer = (NewPlayer) o;
        return playerId == newPlayer.playerId &&
                Objects.equals(email, newPlayer.email) &&
                Objects.equals(firstName, newPlayer.firstName) &&
                Objects.equals(lastName, newPlayer.lastName) &&
                Objects.equals(newGameName, newPlayer.newGameName) &&
                Objects.equals(tournamentType, newPlayer.tournamentType) &&
                Objects.equals(chosenTeam, newPlayer.chosenTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, email, firstName, lastName, newGameName, tournamentType, chosenTeam);
    }

    @Override
    public String toString() {
        return "NewPlayer{" +
                "playerId=" + playerId +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", newGameName='" + newGameName + '\'' +
                ", tournamentType='" + tournamentType + '\'' +
                ", chosenTeam='" + chosenTeam + '\'' +
                '}';
    }
}
