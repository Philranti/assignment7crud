package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.LeagueStats;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.LeagueStatsFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerLeagueTest.LeagueStatsTest;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.LeagueStatsRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.LeagueStatsRepository;

import java.util.Set;

public class LeagueStatsRepoTest {
    LeagueStats leagueStats;
    private LeagueStatsRepository repository;
    private LeagueStatsTest leagueStatsTest;


    private LeagueStats getSavedLeagueStats() {
        Set<LeagueStats> savedLeagueStats = this.repository.getAll();
        return savedLeagueStats.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LeagueStatsRepositories.getRepository();
        //this.leagueStats = leagueStatsTest.setUp();
    }

    @Test
    public void create() {
        LeagueStats created = this.repository.create(this.leagueStats);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.leagueStats);
    }

   /* @Test
    public void read() {
        LeagueStats savedLeagueStats = getSavedLeagueStats();

        LeagueStats read = this.repository.read(Integer.parseInt(savedLeagueStats.getMostPoints()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedLeagueStats, read);
    }*/

    private LeagueStats getsavedLeagueStatsTransfer() {
        Set<LeagueStats> savedLeagueStatsTransfer = this.repository.getAll();
        return savedLeagueStatsTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        LeagueStats savedLeagueStats = getSavedLeagueStats();
        this.repository.delete(savedLeagueStats.getMostPoints());
        getAll();
    }*/

    @Test
    public void update() {
        String createMostPoints = "Manchester City";
        LeagueStats LeagueStats = new LeagueStats.Builder().mostPoints(createMostPoints).build();
        System.out.println("In update, about_to_updated = " +LeagueStats);
        LeagueStats updated = this.repository.update(LeagueStats);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createMostPoints, updated.getMostPoints());
        getAll();
    }

    @Test
    public void getAll() {
        Set<LeagueStats> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
