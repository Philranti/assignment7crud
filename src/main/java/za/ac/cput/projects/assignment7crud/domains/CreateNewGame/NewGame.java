package za.ac.cput.projects.assignment7crud.domains.CreateNewGame;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "NewGame")
public class NewGame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String gameId;
    private String createName;
    private String savedGm;

    public NewGame() {
    }

    private NewGame(Builder builder) {
        this.createName = builder.createName;
        this.savedGm = builder.savedGameName;
        this.gameId = builder.gameId;
    }

    public String getCreateName() {
        return createName;
    }

    public String getsavedGameName() {
        return savedGm;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public void setsavedGameName(String savedGameName) {
        this.savedGm = savedGameName;
    }

    public static class Builder{

        private String createName;
        private String savedGameName;
        private String gameId;

        public Builder gameId(String gameId){
            this.gameId = gameId;
            return this;
        }

        public Builder createName(String createName) {
            this.createName = createName;
            return this;
        }

        public Builder savedGameName(String savedGameName) {
            this.savedGameName = savedGameName;
            return this;
        }

        public NewGame.Builder copy(NewGame newGame){
            this.createName = newGame.createName;
            this.savedGameName = newGame.savedGm;
            this.gameId = newGame.gameId;
            return this;
        }

        public NewGame build() {
            return new NewGame(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewGame newGame = (NewGame) o;
        return gameId == newGame.gameId &&
                Objects.equals(createName, newGame.createName) &&
                Objects.equals(savedGm, newGame.savedGm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, createName, savedGm);
    }

    @Override
    public String toString() {
        return "NewGame{" +
                "gameId=" + gameId +
                ", createName='" + createName + '\'' +
                ", savedGameName='" + savedGm + '\'' +
                '}';
    }
}
