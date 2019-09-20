package za.ac.cput.projects.assignment7crud.factoryTest.SoccerLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.LeagueStats;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.LeagueStatsFactory;

public class LeagueStatsTest {

    LeagueStats leagueStats;

    @Before
    public void setUp() {
         leagueStats = LeagueStatsFactory.createLeagueStats("Barcelona", "Barcelona", "Valencia", "Real Madrid");
    }

    @Test
    public void createLeagueStats(){

        Assert.assertEquals(leagueStats.getMostLeagueTitles(), leagueStats.getMostLeagueTitles());
        System.out.println(leagueStats.toString());

    }

}
