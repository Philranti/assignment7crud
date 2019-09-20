package za.ac.cput.projects.assignment7crud.serviceTest.MasterLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.FreeAgents;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.FreeAgentFactory;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.FreeAgentRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FreeAgentSerTest {
    
    private FreeAgentRepositories repository;
    private FreeAgents freeAgents;

    private FreeAgents getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = FreeAgentRepositories.getRepository();
        this.freeAgents = FreeAgentFactory.freeAgents("Wayne Rooney");
    }

    @Test
    public void a_create() {
        FreeAgents created = this.repository.create(this.freeAgents);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.freeAgents);
    }

    @Test
    public void c_update() {
        String freeAgentPlayer = "Kyle Walker";
        FreeAgents updated = new FreeAgents.Builder().freeAgentPlayer(freeAgentPlayer).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(freeAgentPlayer, updated.getFreeAgentPlayer());
    }

    @Test
    public void e_delete() {
        FreeAgents saved = getSaved();
        this.repository.delete(saved.getFreeAgentPlayer());
        d_getAll();
    }

    @Test
    public void b_read() {
        FreeAgents saved = getSaved();
        FreeAgents read = this.repository.read(saved.getFreeAgentPlayer());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<FreeAgents> FreeAgents = this.repository.getAll();
        System.out.println("In getall, all = " + FreeAgents);
    }
}
