package za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;

public class CupTournamentFactory {
    public static CupTournaments createCupTournament(String nameOfTournament, int numberOfTournaments, int numberOfCupTeams, String clubWinner) {
        return new CupTournaments.Builder()
                .nameOfTournament(nameOfTournament)
                .numberOfTournaments(numberOfTournaments)
                .numberOfCupTeams(numberOfCupTeams)
                .build();
    }
}
