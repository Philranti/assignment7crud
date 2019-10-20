package za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory;

import za.ac.cput.projects.assignment7crud.util.Misc;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;

public class ClubTournamentFactory {
    private static final String SUFFIX = Misc.getSuffixFromClassName(ClubTournamentFactory.class);

    public static ClubTournaments createClubTournament(String clubTournamentName, int teamsParticipating, String clubWinner) {
        return new ClubTournaments.Builder()
                .cupTournamentId(SUFFIX)
                .clubTournament(clubTournamentName)
                .teamsParticipating(teamsParticipating)
                .clubWinner(clubWinner)
                .build();
    }
}
