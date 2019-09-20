package za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostYellowCards;

public class MostYellowCardsFactory {
    public static MostYellowCards createMostYellowCards(int numOfYellowCards) {
        return new MostYellowCards.Builder()
                .numOfYellowCards(numOfYellowCards)
                .build();
    }
}
