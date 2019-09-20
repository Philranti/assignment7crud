package za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory;


import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.NewTransfers;

public class NewTransferFactory {
    public static NewTransfers createNewTransfers(String newPlayerName, double transferFee) {
        return new NewTransfers.Builder()
                .newPlayerName(newPlayerName)
                .transferFee(transferFee)
                .build();
    }
}
