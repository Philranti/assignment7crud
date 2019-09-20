package za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;

public class CupTournamentsFactory {
    public static CupTournaments createCupTournament(String nameOfTournament, int numberOfTournaments, int numberOfCupTeams, String winner) {
        return new CupTournaments.Builder()
                .nameOfTournament(nameOfTournament)
                .numberOfTournaments(numberOfTournaments)
                .numberOfCupTeams(numberOfCupTeams)
                .winner(winner)
                .build();
    }
}
