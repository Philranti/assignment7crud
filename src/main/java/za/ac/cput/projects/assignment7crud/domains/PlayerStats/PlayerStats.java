package za.ac.cput.projects.assignment7crud.domains.PlayerStats;

import java.util.Objects;

public class PlayerStats implements Stat {
    private String playerName;

    public PlayerStats() {
    }

    private PlayerStats(Builder builder) {
        this.playerName = builder.playerName;

    }

    public String getPlayerName() {
        return playerName;
    }

    public static class Builder{

        private String playerName;

        public Builder  playerName(String playerName) {
            this.playerName = playerName;
            return this;
        }



        public PlayerStats build() {
            return new PlayerStats(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerStats that = (PlayerStats) o;
        return Objects.equals(playerName, that.playerName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playerName);
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "playerName='" + playerName + '\'' +
                '}';
    }
}
