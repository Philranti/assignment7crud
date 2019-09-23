package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.TransferListed;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.TransferListedFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.TransferListTest;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.TransferListedRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.TransferListedRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransferListRepoTest {
    TransferListed transferListed;

    private TransferListedRepository repository;
    private TransferListTest TransferListedTest;


    private TransferListed getSavedTransferListed() {
        Set<TransferListed> savedtransferListedTransfer = this.repository.getAll();
        return savedtransferListedTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TransferListedRepositories.getRepository();
       // this.transferListed = TransferListedTest.setUp();
    }

    @Test
    public void create() {
        TransferListed created = this.repository.create(this.transferListed);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.transferListed);
    }

   /* @Test
    public void read() {
        TransferListed savedTransferListed = getSavedTransferListed();

        TransferListed read = this.repository.read(savedTransferListed.getTeamInterested());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedTransferListed, read);
    }*/

    private TransferListed getsavedtransferListedTransfer() {
        Set<TransferListed> savedtransferListedTransfer = this.repository.getAll();
        return savedtransferListedTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        TransferListed savedTransferListed = getSavedTransferListed();
        this.repository.delete(savedTransferListed.getTeamInterested());
        getAll();
    }*/

    @Test
    public void update() {
        String teamInterestedName = "Chelsea";
        TransferListed teamInterested = new TransferListed.Builder().teamInterested(teamInterestedName).build();
        System.out.println("In update, about_to_updated = " +teamInterested);
        TransferListed updated = this.repository.update(teamInterested);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(teamInterestedName, updated.getTeamInterested());
        getAll();
    }

    @Test
    public void getAll() {
        Set<TransferListed> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
