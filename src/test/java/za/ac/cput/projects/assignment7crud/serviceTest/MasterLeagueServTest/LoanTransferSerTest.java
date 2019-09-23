package za.ac.cput.projects.assignment7crud.serviceTest.MasterLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.LoanTranferFactory;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.LoanTransferRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoanTransferSerTest {

    private LoanTransferRepositories repository;
    private LoanTransfers loanTransfers;

    private LoanTransfers getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LoanTransferRepositories.getRepository();
        this.loanTransfers = LoanTranferFactory.loanTransfers("Cristiano Ronaldo", 75000000.00, 5);
    }

    @Test
    public void a_create() {
        LoanTransfers created = this.repository.create(this.loanTransfers);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.loanTransfers);
    }

    @Test
    public void c_update() {
        String newLoanedPlayer = "Kylian Mbappe";
        LoanTransfers updated = new LoanTransfers.Builder().loanedPlayer(newLoanedPlayer).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newLoanedPlayer, updated.getLoanedPlayer());
    }

    @Test
    public void e_delete() {
        LoanTransfers saved = getSaved();
        this.repository.delete(saved.getLoanedPlayer());
        d_getAll();
    }

   /* @Test
    public void b_read() {
        LoanTransfers saved = getSaved();
        LoanTransfers read = this.repository.read(saved.getLoanedPlayer());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<LoanTransfers> LoanTransfers = this.repository.getAll();
        System.out.println("In getall, all = " + LoanTransfers);
    }

}
