package za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory;


import za.ac.cput.projects.assignment7crud.domains.PlayerStats.TopGoalScorers;

public class TopScorerFactory {
    public static TopGoalScorers createTopScorer(int numOfGoalsScored) {
        return new TopGoalScorers.Builder()
                .numOfGoalsScored(numOfGoalsScored)
                .build();
    }
}
