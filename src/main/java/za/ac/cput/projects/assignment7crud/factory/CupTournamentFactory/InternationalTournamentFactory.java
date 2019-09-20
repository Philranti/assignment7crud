package za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory;

import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;


public class InternationalTournamentFactory {
    public static InternationalTournaments internationalTournaments(String interTournamentName, int numOfInternationalTournaments
            , int numOfNationsParticipating
            , String nationWinner) {
        return new InternationalTournaments.Builder()
                .interTournamentName(interTournamentName)
                .numOfInternationalTournaments(numOfInternationalTournaments)
                .numOfNationsParticipating(numOfNationsParticipating)
                .nationWinner(nationWinner)
                .build();
    }

}
