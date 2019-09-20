package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.LoanTranferFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.LoanTransferTest;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.LoanTransferRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.LoanTransferRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoanTransferRepoTest {
    LoanTransfers loan;

    private LoanTransferRepository repository;
    private LoanTransferTest LoanTransfersTest;


    private LoanTransfers getSavedLoanTransfers() {
        Set<LoanTransfers> savedLoanTransfer = this.repository.getAll();
        return savedLoanTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LoanTransferRepositories.getRepository();
      //  this.loan = LoanTransfersTest.setUp();
    }

    @Test
    public void create() {
        LoanTransfers created = this.repository.create(this.loan);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.loan);
    }

    @Test
    public void read() {
        LoanTransfers savedLoanTransfers = getSavedLoanTransfers();

        LoanTransfers read = this.repository.read(savedLoanTransfers.getLoanedPlayer());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedLoanTransfers, read);
    }

    private LoanTransfers getsavedLoanTransfer() {
        Set<LoanTransfers> savedLoanTransfer = this.repository.getAll();
        return savedLoanTransfer.iterator().next();
    }

    @Test
    public void delete() {
        LoanTransfers savedLoanTransfers = getSavedLoanTransfers();
        this.repository.delete(savedLoanTransfers.getLoanedPlayer());
        getAll();
    }

    @Test
    public void update() {
        String loanedPlayerName = "David Sancho";
        LoanTransfers LoanTransfers = new LoanTransfers.Builder().loanedPlayer(loanedPlayerName).build();
        System.out.println("In update, about_to_updated = " +LoanTransfers);
        LoanTransfers updated = this.repository.update(LoanTransfers);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(loanedPlayerName, updated.getLoanedPlayer());
        getAll();
    }

    @Test
    public void getAll() {
        Set<LoanTransfers> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
