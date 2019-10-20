package za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory;

import za.ac.cput.projects.assignment7crud.util.Misc;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;


public class InternationalTournamentFactory {
    private static final String SUFFIX = Misc.getSuffixFromClassName(InternationalTournamentFactory.class);
    public static InternationalTournaments internationalTournaments(String interTournamentName, int numOfInternationalTournaments
            , int numOfNationsParticipating
            , String nationWinner) {
        return new InternationalTournaments.Builder()
                .internationalTournamentId(SUFFIX)
                .interTournamentName(interTournamentName)
                .numOfInternationalTournaments(numOfInternationalTournaments)
                .numOfNationsParticipating(numOfNationsParticipating)
                .nationWinner(nationWinner)
                .build();
    }

}
