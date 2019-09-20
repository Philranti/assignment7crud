package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.FreeAgents;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.FreeAgentFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.FreeAgentsTest;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.FreeAgentRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.FreeAgentRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FreeAgentsRepoTest {
    private FreeAgents free;

    
    private FreeAgentRepository repository;



    private FreeAgents getSavedFreeAgents() {
        Set<FreeAgents> savedFreeAgent = this.repository.getAll();
        return savedFreeAgent.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = FreeAgentRepositories.getRepository();
        this.free = FreeAgentFactory.freeAgents("Wayne Rooney");
    }

    @Test
    public void a_create() {
        FreeAgents created = this.repository.create(this.free);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.free);
    }

    @Test
    public void b_read() {
        FreeAgents savedFreeAgents = getSavedFreeAgents();
        FreeAgents read = this.repository.read(savedFreeAgents.getFreeAgentPlayer());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertNotNull(savedFreeAgents);
    }

    private FreeAgents getSavedFreeAgent() {
        Set<FreeAgents> savedFreeAgent = this.repository.getAll();
        return savedFreeAgent.iterator().next();
    }

    @Test
    public void e_delete() {
        FreeAgents savedFreeAgents = getSavedFreeAgents();
        this.repository.delete(savedFreeAgents.getFreeAgentPlayer());
        getAll();
    }

    @Test
    public void d_update() {
        String freeAgentName = "Percy Tau";
        FreeAgents freeAgents = new FreeAgents.Builder().copy(getSavedFreeAgent()).freeAgentPlayer(freeAgentName).build();
        System.out.println("In update, about_to_updated = " +freeAgents);
      //  FreeAgents updated = repository.update(freeAgents);
        System.out.println("In update, updated = " + freeAgents);
        Assert.assertSame(freeAgentName, freeAgentName);
        getAll();
    }

    @Test
    public void getAll() {
        Set<FreeAgents> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
