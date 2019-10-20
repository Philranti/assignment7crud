package za.ac.cput.projects.assignment7crud.domains.users;

//import sun.security.provider.certpath.Builder;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "playerId",columnDefinition = "VARCHAR(100)",nullable=false)
    private String playerId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String lastName;

    private Player() {
    }

    public Player(Builder builder) {
        this.playerId = builder.playerId;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;

    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{
        private String email, firstName, lastName, playerId;

        public Builder playerId(String playerId){
            this.email = email;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Player player) {
            this.email = player.email;
            this.firstName = player.firstName;
            this.lastName = player.lastName;
            this.playerId = player.playerId;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerId, player.playerId) &&
                Objects.equals(email, player.email) &&
                Objects.equals(firstName, player.firstName) &&
                Objects.equals(lastName, player.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, email, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
