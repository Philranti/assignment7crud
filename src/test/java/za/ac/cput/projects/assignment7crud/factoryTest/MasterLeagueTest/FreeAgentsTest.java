package za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.FreeAgents;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.FreeAgentFactory;

public class FreeAgentsTest {
    FreeAgents free;

    @Before
    public void setup(){
        free = FreeAgentFactory.freeAgents("Wayne Rooney");
    }

    @Test
    public void createFreeAgent(){

        Assert.assertEquals(free.getFreeAgentPlayer(),free.getFreeAgentPlayer());
        System.out.println(free.toString());
    }
}
