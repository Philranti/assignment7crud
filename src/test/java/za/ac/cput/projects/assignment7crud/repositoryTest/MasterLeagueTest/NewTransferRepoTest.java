package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.NewTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.NewTransferFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.NewTransferTest;

import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.NewTransferRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.NewTransferRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewTransferRepoTest {

    @Autowired
    private NewTransfers newTransfers;

    private NewTransferRepository repository;
 //   private NewTransferTest newTransferTest;


    private NewTransfers getSavedNewTransfers() {
        Set<NewTransfers> savedLoanTransfer = this.repository.getAll();
        return savedLoanTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = NewTransferRepositories.getRepository();
      //  this.newTransfers = newTransferTest.setUp();
    }

    @Test
    public void create() {
        NewTransfers created = this.repository.create(this.newTransfers);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.newTransfers);
    }

/*    @Test
    public void read() {
        NewTransfers savedNewTransfers = getSavedNewTransfers();

        NewTransfers read = this.repository.read(savedNewTransfers.getNewPlayerName());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedNewTransfers, read);
    }*/

    private NewTransfers getsavedLoanTransfer() {
        Set<NewTransfers> savedLoanTransfer = this.repository.getAll();
        return savedLoanTransfer.iterator().next();
    }

  /*  @Test
    public void delete() {
        NewTransfers savedNewTransfers = getSavedNewTransfers();
        this.repository.delete(savedNewTransfers.getNewPlayerName());
        getAll();
    }*/

    @Test
    public void update() {
        String newTransferName = "David Sancho";
        NewTransfers NewTransfers = new NewTransfers.Builder().newPlayerName(newTransferName).build();
        System.out.println("In update, about_to_updated = " +NewTransfers);
        NewTransfers updated = this.repository.update(NewTransfers);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newTransferName, updated.getNewPlayerName());
        getAll();
    }

    @Test
    public void getAll() {
        Set<NewTransfers> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
