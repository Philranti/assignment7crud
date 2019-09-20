package za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.MasterLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.MasterLeagueFactory;

public class MasterLeagueTest {
    MasterLeague master;

    @Before
    public void setUp() {master = MasterLeagueFactory.createMasterLeage("English", "Manchester City");
    }

    @Test
    public void createMasterLeague(){

        Assert.assertEquals(master.getTeamChosen(), master.getTeamChosen());
        System.out.println(master.toString());
    }
}
