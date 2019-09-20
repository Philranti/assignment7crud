package za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.PlayerStats;

public class PlayerStatsFactory {
    public static PlayerStats createPlayerStats(String playerName) {
        return new PlayerStats.Builder()
                .playerName(playerName)
                .build();
    }
}
