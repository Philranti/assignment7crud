package za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostAssists;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostAssistFactory;

public class MostAssistTest {
    MostAssists assists;

    @Before
    public void setUp(){

        assists = MostAssistFactory.createMostAssist(20);
    }

    @Test
    public void createMostAssist(){

        Assert.assertEquals(assists.getNumOfAssist(), assists.getNumOfAssist());
        System.out.println(assists.toString());
    }

}
