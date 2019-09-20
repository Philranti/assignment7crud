package za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.PromotePlayers;

public class PromotedPlayerFactory {
    public static PromotePlayers promotePlayers(String promotedPlayer) {
        return new PromotePlayers.Builder()
                .promotedPlayer(promotedPlayer)
                .build();
    }
}
