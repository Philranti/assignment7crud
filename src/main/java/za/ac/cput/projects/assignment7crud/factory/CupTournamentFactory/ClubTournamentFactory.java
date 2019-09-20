package za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory;

import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;

public class ClubTournamentFactory {
    public static ClubTournaments createClubTournament(String clubTournamentName, int teamsParticipating, String clubWinner) {
        return new ClubTournaments.Builder()
                .clubTournament(clubTournamentName)
                .teamsParticipating(teamsParticipating)
                .clubWinner(clubWinner)
                .build();
    }
}
