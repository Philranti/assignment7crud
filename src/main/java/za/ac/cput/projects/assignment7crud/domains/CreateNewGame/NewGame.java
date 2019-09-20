package za.ac.cput.projects.assignment7crud.domains.CreateNewGame;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;


public class NewGame {

    private String createName;
    private String deleteGameName;

    public NewGame() {
    }

    private NewGame(Builder builder) {
        this.createName = builder.createName;
        this.deleteGameName = builder.deleteGameName;

    }

    public String getCreateName() {
        return createName;
    }

    public String getDeleteGameName() {
        return deleteGameName;
    }

    public static class Builder{

        private String createName;
        private String deleteGameName;

        public Builder createName(String createName) {
            this.createName = createName;
            return this;
        }

        public Builder deleteGameName(String deleteGameName) {
            this.deleteGameName = deleteGameName;
            return this;
        }

        public NewGame.Builder copy(NewGame newGame){
            this.createName = newGame.createName;
            this.deleteGameName = newGame.deleteGameName;
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
        return Objects.equals(createName, newGame.createName) &&
                Objects.equals(deleteGameName, newGame.deleteGameName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(createName, deleteGameName);
    }

    @Override
    public String toString() {
        return "NewGame{" +
                "createName='" + createName + '\'' +
                ", deleteGameName='" + deleteGameName + '\'' +
                '}';
    }
}
