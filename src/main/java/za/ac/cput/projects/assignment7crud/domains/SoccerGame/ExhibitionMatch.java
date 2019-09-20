package za.ac.cput.projects.assignment7crud.domains.SoccerGame;

import java.util.Objects;

public class ExhibitionMatch {
    private String scoreResult;
    private String playerWon;
    private boolean homeGame;


    public ExhibitionMatch() {
    }

    private ExhibitionMatch(Builder builder) {
        this.scoreResult = builder.scoreResult;
        this.playerWon = builder.playerWon;
        this.homeGame = builder.homeGame;
    }

    public String getScoreResult() {
        return scoreResult;
    }

    public String getPlayerWon() {
        return playerWon;
    }

    public boolean isHomeGame() {
        return homeGame;
    }

    public static class Builder{

        private String scoreResult;
        private String playerWon;
        private boolean homeGame;

        public Builder scoreResult(String scoreResult) {
            this.scoreResult = scoreResult;
            return this;
        }

        public Builder playerWon(String playerWon) {
            this.playerWon = playerWon;
            return this;
        }


        public Builder homeGame(boolean homeGame) {
            this.homeGame = homeGame;
            return this;
        }

        public ExhibitionMatch build() {
            return new ExhibitionMatch(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExhibitionMatch that = (ExhibitionMatch) o;
        return isHomeGame() == that.isHomeGame() &&
                Objects.equals(getScoreResult(), that.getScoreResult()) &&
                Objects.equals(getPlayerWon(), that.getPlayerWon());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getScoreResult(), getPlayerWon(), isHomeGame());
    }

    @Override
    public String toString() {
        return "ExhibitionMatch{" +
                "scoreResult='" + scoreResult + '\'' +
                ", playerWon='" + playerWon + '\'' +
                ", homeGame=" + homeGame +
                '}';
    }
}
