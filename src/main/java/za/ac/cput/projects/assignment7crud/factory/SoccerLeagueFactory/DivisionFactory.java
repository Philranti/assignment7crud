package za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.Divisions;

public class DivisionFactory {
    public static Divisions createDivisions(String divisionPlayed, int numOfTeams, String currentChampions) {
        return new Divisions.Builder()
                .divisionPlayed(divisionPlayed)
                .numOfTeams(numOfTeams)
                .currentChampions(currentChampions)
                .build();
    }
}
