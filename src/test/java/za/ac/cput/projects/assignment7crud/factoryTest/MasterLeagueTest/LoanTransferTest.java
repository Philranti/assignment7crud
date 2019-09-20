package za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.LoanTranferFactory;


public class LoanTransferTest {
    LoanTransfers loan;

    @Before
    public void setUp() {
        loan = LoanTranferFactory.loanTransfers("Cristiano Ronaldo", 75000000.00, 5);
    }

    @Test
    public void createLoanTransfer() {

        Assert.assertEquals(loan.getLoanDurationYear(), loan.getLoanDurationYear());
        System.out.println(loan.toString());
    }
}