package za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostRedCards;

public class MostRedCardFactory {
    public static MostRedCards createMostRedCards(int numOfRedCards) {
    return new MostRedCards.Builder()
            .numOfRedCards(numOfRedCards)
            .build();
}

}
