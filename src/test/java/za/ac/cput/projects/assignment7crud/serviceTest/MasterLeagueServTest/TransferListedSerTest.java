package za.ac.cput.projects.assignment7crud.serviceTest.MasterLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.TransferListed;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.TransferListedFactory;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.TransferListedRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransferListedSerTest {

    private TransferListedRepositories repository;
    private TransferListed transferListed;

    private TransferListed getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TransferListedRepositories.getRepository();
        this.transferListed = TransferListedFactory.createTransferList("Ross Barkley", "Arsenal");
    }

    @Test
    public void a_create() {
        TransferListed created = this.repository.create(this.transferListed);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.transferListed);
    }

    @Test
    public void c_update() {
        String transferedPlayer = "Alexis Sanches";
        TransferListed updated = new TransferListed.Builder().transferedPlayer(transferedPlayer).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(transferedPlayer, updated.getTransferedPlayer());
    }

    @Test
    public void e_delete() {
        TransferListed saved = getSaved();
        this.repository.delete(saved.getTransferedPlayer());
        d_getAll();
    }

  /*  @Test
    public void b_read() {
        TransferListed saved = getSaved();
        TransferListed read = this.repository.read(saved.getTransferedPlayer());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<TransferListed> TransferListed = this.repository.getAll();
        System.out.println("In getall, all = " + TransferListed);
    }

}
