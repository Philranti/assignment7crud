package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.LoanTranferFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.LoanTransferTest;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.LoanTransferRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.LoanTransferRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoanTransferRepoTest {

    @Autowired
    private LoanTransfers loan;
    private LoanTransferRepository repository;



    private LoanTransfers getSavedLoanTransfers() {
        Set<LoanTransfers> savedLoanTransfer = this.repository.getAll();
        return savedLoanTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LoanTransferRepositories.getRepository();
       this.loan  = LoanTranferFactory.loanTransfers("Cristiano Ronaldo", 7500000.00, 5);
    }

    @Test
    public void a_create() {
        LoanTransfers created = this.repository.create(this.loan);
        System.out.println("In create, created = " + created);
        c_getAll();
        Assert.assertSame(created, this.loan);
    }

   /* @Test
    public void b_read() {
        LoanTransfers savedLoanTransfers = getSavedLoanTransfers();
        System.out.println("In read, read = "+ savedLoanTransfers.getLoanedPlayer());
        LoanTransfers readPlayer = this.repository.read(savedLoanTransfers.getLoanedPlayer());
        System.out.println("In read, read = " + readPlayer);
        Assert.assertEquals(savedLoanTransfers, readPlayer.getLoanedPlayer());
        c_getAll();
    }*/



    @Test
    public void e_delete() {
        LoanTransfers savedLoanTransfers = getSavedLoanTransfers();
        this.repository.delete(savedLoanTransfers.getLoanedPlayer());
        c_getAll();
    }

    @Test
    public void d_update() {
        String loanedPlayerName = "David Sancho";
        LoanTransfers LoanTransfers = new LoanTransfers.Builder().loanedPlayer(loanedPlayerName).build();
        System.out.println("In update, about_to_updated = " +LoanTransfers);
        LoanTransfers updated = this.repository.update(LoanTransfers);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(loanedPlayerName, updated.getLoanedPlayer());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        Set<LoanTransfers> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
