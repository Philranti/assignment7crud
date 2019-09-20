package za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.Transfers;

public class TransfersFactory {
    public static Transfers createTransfers(int playersRating, int age, String playersPosition, String previousClub, String currentClub) {
        return new Transfers.Builder()
                .playersRating(playersRating)
                .age(age)
                .playersPosition(playersPosition)
                .previousClub(previousClub)
                .currentClub(currentClub)
                .build();
    }
}
