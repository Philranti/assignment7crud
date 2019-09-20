package za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;

public class LoanTranferFactory {
    public static LoanTransfers loanTransfers(String loanedPlayer, double loanFee, int loanDurationYear) {
        return new LoanTransfers.Builder()
                .loanedPlayer(loanedPlayer)
                .loanFee(loanFee)
                .loanDurationYear(loanDurationYear)
                .build();
    }
}
