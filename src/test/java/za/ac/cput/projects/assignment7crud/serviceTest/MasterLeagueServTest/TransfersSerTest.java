package za.ac.cput.projects.assignment7crud.serviceTest.MasterLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.Transfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.TransfersFactory;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.TransfersRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransfersSerTest {

    private TransfersRepositories repository;
    private Transfers transfers;

    private Transfers getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TransfersRepositories.getRepository();
        this.transfers = TransfersFactory.createTransfers(5,25,"Striker",
                "Everton", "Liverpool");
    }

    @Test
    public void a_create() {
        Transfers created = this.repository.create(this.transfers);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.transfers);
    }

    @Test
    public void c_update() {
        int playerAge = 26;
        Transfers updated = new Transfers.Builder().age(playerAge).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(playerAge, updated.getAge());
    }

   /* @Test
    public void e_delete() {
        Transfers saved = getSaved();
        this.repository.delete(String.valueOf(saved.getAge()));
        d_getAll();
    }*/

  /*  @Test
    public void b_read() {
        Transfers saved = getSaved();
        Transfers read = this.repository.read(String.valueOf(saved.getAge()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<Transfers> Transfers = this.repository.getAll();
        System.out.println("In getall, all = " + Transfers);
    }
}
