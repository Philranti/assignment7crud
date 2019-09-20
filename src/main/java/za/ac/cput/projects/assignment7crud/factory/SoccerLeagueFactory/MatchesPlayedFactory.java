package za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory;

import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.MatchePlayed;

public class MatchesPlayedFactory {
    public static MatchePlayed createMatchesPlayed(int playedMatches, int matchesWon, int matchesDrawn, int matchesLost) {
        return new MatchePlayed.Builder()
                .playedMatches(playedMatches)
                .matchesWon(matchesWon)
                .matchesDrawn(matchesDrawn)
                .matchesLost(matchesLost)
                .build();
    }
}
