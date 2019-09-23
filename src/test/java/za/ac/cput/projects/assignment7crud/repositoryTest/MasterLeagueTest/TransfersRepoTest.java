package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.Transfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.TransfersFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.TransfersTest;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.TransfersRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.TransfersRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransfersRepoTest {
    Transfers transfers;

    private TransfersRepository repository;
    private TransfersTest TransfersTest;


    private Transfers getSavedTransfers() {
        Set<Transfers> savedLoanTransfer = this.repository.getAll();
        return savedLoanTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TransfersRepositories.getRepository();
      //  this.transfers = TransfersTest.setUp();
    }

    @Test
    public void create() {
        Transfers created = this.repository.create(this.transfers);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.transfers);
    }

  /*  @Test
    public void read() {
        Transfers savedTransfers = getSavedTransfers();

        Transfers read = this.repository.read(savedTransfers.getPlayersPosition());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedTransfers, read);
    }*/

    private Transfers getsavedLoanTransfer() {
        Set<Transfers> savedTransfers = this.repository.getAll();
        return savedTransfers.iterator().next();
    }

   /* @Test
    public void delete() {
        Transfers savedTransfers = getSavedTransfers();
        this.repository.delete(savedTransfers.getPlayersPosition());
        getAll();
    }*/

    @Test
    public void update() {
        String playersPosition = "Defender";
        Transfers playerPosition = new Transfers.Builder().playersPosition(playersPosition).build();
        System.out.println("In update, about_to_updated = " +playerPosition);
        Transfers updated = this.repository.update(playerPosition);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(playersPosition, updated.getPlayersPosition());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Transfers> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
