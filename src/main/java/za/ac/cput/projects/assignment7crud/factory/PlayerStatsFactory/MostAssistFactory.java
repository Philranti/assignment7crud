package za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory;


import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostAssists;

public class MostAssistFactory {
    public static MostAssists createMostAssist(int numOfAssist) {
        return new MostAssists.Builder()
                .numOfAssist(numOfAssist)
                .build();
    }
}
