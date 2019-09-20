package za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches;

import java.util.Objects;

public class GamePlay {
    private String playerMode;
    private int minutesPlay;
    private boolean extraTime;
    private boolean penalties;
    private int numOfSubs;
    private String venueChosen;

    public GamePlay() {
    }

    private GamePlay(Builder builder) {
        this.playerMode = builder.playerMode;
        this.minutesPlay = builder.minutesPlay;
        this.extraTime = builder.extraTime;
        this.penalties = builder.penalties;
        this.numOfSubs = builder.numOfSubs;
        this.venueChosen = builder.venueChosen;
    }

    public String getPlayerMode() {
        return playerMode;
    }

    public int getMinutesPlay() {
        return minutesPlay;
    }

    public boolean isExtraTime() {
        return extraTime;
    }

    public boolean isPenalties() {
        return penalties;
    }

    public int getNumOfSubs() {
        return numOfSubs;
    }

    public String getVenueChosen() {
        return venueChosen;
    }

    public static class Builder{

        private String playerMode;
        private int minutesPlay;
        private boolean extraTime;
        private boolean penalties;
        private int numOfSubs;
        private String venueChosen;

        public Builder playerMode(String playerMode) {
            this.playerMode = playerMode;
            return this;
        }

        public Builder minutesPlay(int minutesPlay) {
            this.minutesPlay = minutesPlay;
            return this;
        }

        public Builder extraTime(boolean extraTime) {
            this.extraTime = extraTime;
            return this;
        }

        public Builder penalties(boolean penalties) {
            this.penalties = penalties;
            return this;
        }

        public Builder numOfSubs(int numOfSubs) {
            this.numOfSubs = numOfSubs;
            return this;
        }

        public Builder venueChosen(String venueChosen) {
            this.venueChosen = venueChosen;
            return this;
        }

        public GamePlay.Builder copy(GamePlay gamePlay){
            this.extraTime = gamePlay.extraTime;
            this.minutesPlay = gamePlay.minutesPlay;
            this.numOfSubs = gamePlay.numOfSubs;
            this.penalties = gamePlay.penalties;
            this.playerMode = gamePlay.playerMode;
            this.venueChosen = gamePlay.venueChosen;
            return this;
        }

        public GamePlay build() {
            return new GamePlay(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamePlay gamePlay = (GamePlay) o;
        return minutesPlay == gamePlay.minutesPlay &&
                extraTime == gamePlay.extraTime &&
                penalties == gamePlay.penalties &&
                numOfSubs == gamePlay.numOfSubs &&
                Objects.equals(playerMode, gamePlay.playerMode) &&
                Objects.equals(venueChosen, gamePlay.venueChosen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playerMode, minutesPlay, extraTime, penalties, numOfSubs, venueChosen);
    }

    @Override
    public String toString() {
        return "GamePlay{" +
                "playerMode='" + playerMode + '\'' +
                ", minutesPlay=" + minutesPlay +
                ", extraTime=" + extraTime +
                ", penalties=" + penalties +
                ", numOfSubs=" + numOfSubs +
                ", venueChosen='" + venueChosen + '\'' +
                '}';
    }
}
