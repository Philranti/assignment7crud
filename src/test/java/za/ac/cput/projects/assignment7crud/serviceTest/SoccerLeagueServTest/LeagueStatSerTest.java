package za.ac.cput.projects.assignment7crud.serviceTest.SoccerLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.LeagueStats;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.LeagueStatsFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.LeagueStatsRepositories;

import java.util.Set;

public class LeagueStatSerTest {

    private LeagueStatsRepositories repository;
    private LeagueStats LeagueStats;

    private LeagueStats getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LeagueStatsRepositories.getRepository();
        this.LeagueStats = LeagueStatsFactory.createLeagueStats("Barcelona", "Barcelona", "Valencia", "Real Madrid");
    }

    @Test
    public void a_create() {
        LeagueStats created = this.repository.create(this.LeagueStats);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.LeagueStats);
    }

    @Test
    public void c_update() {
        String mostPoints = "Liverpool";
        LeagueStats updated = new LeagueStats.Builder().mostPoints(mostPoints).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(mostPoints, updated.getMostPoints());
    }

    @Test
    public void e_delete() {
        LeagueStats saved = getSaved();
        this.repository.delete(saved.getMostPoints());
        d_getAll();
    }

    @Test
    public void b_read() {
        LeagueStats saved = getSaved();
        LeagueStats read = this.repository.read(Integer.parseInt(saved.getMostPoints()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<LeagueStats> LeagueStats = this.repository.getAll();
        System.out.println("In getall, all = " + LeagueStats);
    }

}
