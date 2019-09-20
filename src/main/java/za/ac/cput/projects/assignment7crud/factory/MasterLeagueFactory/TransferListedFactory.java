package za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.TransferListed;

public class TransferListedFactory {
    public static TransferListed createTransferList(String transferedPlayer, String teamInterested ) {
        return new TransferListed.Builder()
                .transferedPlayer(transferedPlayer)
                .teamInterested(teamInterested)
                .build();
    }
}
