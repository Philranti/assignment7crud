package za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class GamePlay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "playerId",columnDefinition = "VARCHAR(100)",nullable=false)
    private String gamePlayId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String playerMode;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int minutesPlay;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private boolean extraTime;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private boolean penalties;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numOfSubs;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String venueChosen;

    public GamePlay() {
    }

    private GamePlay(Builder builder) {
        this.gamePlayId = builder.gamePlayId;
        this.playerMode = builder.playerMode;
        this.minutesPlay = builder.minutesPlay;
        this.extraTime = builder.extraTime;
        this.penalties = builder.penalties;
        this.numOfSubs = builder.numOfSubs;
        this.venueChosen = builder.venueChosen;
    }

    public String getGamePlayId() {
        return gamePlayId;
    }

    public void setGamePlayId(String gamePlayId) {
        this.gamePlayId = gamePlayId;
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
        private String gamePlayId;
        private String playerMode;
        private int minutesPlay;
        private boolean extraTime;
        private boolean penalties;
        private int numOfSubs;
        private String venueChosen;

        public Builder gamePlayId(String gamePlayId){
            this.gamePlayId = gamePlayId;
            return this;
        }

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
            this.gamePlayId = gamePlay.gamePlayId;
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
        return gamePlayId == gamePlay.gamePlayId &&
                minutesPlay == gamePlay.minutesPlay &&
                extraTime == gamePlay.extraTime &&
                penalties == gamePlay.penalties &&
                numOfSubs == gamePlay.numOfSubs &&
                Objects.equals(playerMode, gamePlay.playerMode) &&
                Objects.equals(venueChosen, gamePlay.venueChosen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamePlayId, playerMode, minutesPlay, extraTime, penalties, numOfSubs, venueChosen);
    }

    @Override
    public String toString() {
        return "GamePlay{" +
                "gamePlayId=" + gamePlayId +
                ", playerMode='" + playerMode + '\'' +
                ", minutesPlay=" + minutesPlay +
                ", extraTime=" + extraTime +
                ", penalties=" + penalties +
                ", numOfSubs=" + numOfSubs +
                ", venueChosen='" + venueChosen + '\'' +
                '}';
    }
}
