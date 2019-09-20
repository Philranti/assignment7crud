package za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostCleanSheets;

public class MostCleanSheetsFactory {
    public static MostCleanSheets createMostCleanSheets(int numOfCleanSheets, int numOfGoalsConceded) {
        return new MostCleanSheets.Builder()
                .numOfCleanSheets(numOfCleanSheets)
                .numOfGoalsConceded(numOfGoalsConceded)
                .build();
    }
}
