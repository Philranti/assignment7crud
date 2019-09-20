package za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.PlayerStats;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.PlayerStatsFactory;

public class PlayerStatsTest {
    PlayerStats playerStats;

    @Before
    public void setUp(){
        playerStats = PlayerStatsFactory.createPlayerStats("Raheem Sterling");
    }

    @Test
    public void createPlayerStats(){

        Assert.assertEquals(playerStats.getPlayerName(), playerStats.getPlayerName());
        System.out.println(playerStats.toString());
    }
}
