package za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.LeagueStats;

public class LeagueStatsFactory {
    public static LeagueStats createLeagueStats(String mostLeagueTitles, String mostWins, String mostLoses, String mostPoints) {
        return new LeagueStats.Builder()
                .mostLeagueTitles(mostLeagueTitles)
                .mostWins(mostWins)
                .mostLoses(mostLoses)
                .mostPoints(mostPoints)
                .build();
    }
}
