package za.ac.cput.projects.assignment7crud.serviceTest.MasterLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.NewTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.NewTransferFactory;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.NewTransferRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewTransferSerTest {

    private NewTransferRepositories repository;
    private NewTransfers newTransfers;

    private NewTransfers getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = NewTransferRepositories.getRepository();
        this.newTransfers = NewTransferFactory.createNewTransfers("Lionel Messi", 60000);
    }

    @Test
    public void a_create() {
        NewTransfers created = this.repository.create(this.newTransfers);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.newTransfers);
    }

    @Test
    public void c_update() {
        String newTransferPlayer = "Sergio Aguero";
        NewTransfers updated = new NewTransfers.Builder().newPlayerName(newTransferPlayer).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTransferPlayer, updated.getNewPlayerName());
    }

    @Test
    public void e_delete() {
        NewTransfers saved = getSaved();
        this.repository.delete(saved.getNewPlayerName());
        d_getAll();
    }

   /* @Test
    public void b_read() {
        NewTransfers saved = getSaved();
        NewTransfers read = this.repository.read(saved.getNewPlayerName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<NewTransfers> NewTransfers = this.repository.getAll();
        System.out.println("In getall, all = " + NewTransfers);
    }

}
