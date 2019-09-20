package za.ac.cput.projects.assignment7crud.domains.SoccerGame;

import java.util.Objects;

public class SoccerGame {
    private int gameId;
    private String gameType;        // is it a FIFA game or PES game
    private String gameDifficulty;  // is it easy, medium or very difficult
    private int gameLength;         // how many minutes does the game last


    public SoccerGame() {
    }

    private SoccerGame(Builder builder) {
        this.gameId = builder.gameId;
        this.gameType = builder.gameType;
        this.gameDifficulty = builder.gameDifficulty;
        this.gameLength = builder.gameLength;
    }

    public String getGameType() {
        return gameType;
    }

    public String getGameDifficulty() {
        return gameDifficulty;
    }

    public int getGameLength() {
        return gameLength;
    }

    public int getGameId() {
        return gameId;
    }

    public static class Builder{
        private int gameId;
        private String gameType;
        private String gameDifficulty;
        private int gameLength;

        public Builder gameId(int gameId) {
            this.gameId = gameId;
            return this;
        }

        public Builder gameType(String gameType) {
            this.gameType = gameType;
            return this;
        }

        public Builder gameDifficulty(String gameDifficulty) {
            this.gameDifficulty = gameDifficulty;
            return this;
        }

        public Builder gameLength(int gameLength) {
            this.gameLength = gameLength;
            return this;
        }

        public SoccerGame build() {
            return new SoccerGame(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerGame that = (SoccerGame) o;
        return getGameLength() == that.getGameLength() &&
                getGameId() == that.getGameId() &&
                Objects.equals(getGameType(), that.getGameType()) &&
                Objects.equals(getGameDifficulty(), that.getGameDifficulty());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getGameType(), getGameDifficulty(), getGameLength(), getGameId());
    }

    @Override
    public String toString() {
        return "SoccerGame{" +
                "gameId=" + gameId +
                ", gameType='" + gameType + '\'' +
                ", gameDifficulty='" + gameDifficulty + '\'' +
                ", gameLength=" + gameLength +
                '}';
    }
}
