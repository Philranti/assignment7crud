package za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostRedCards;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostRedCardFactory;

public class MostRedCardsTest {
    MostRedCards reds;

    @Before
    public void setUp(){
        reds = MostRedCardFactory.createMostRedCards(10);
    }

    @Test
    public void createRedCard(){

        Assert.assertEquals(reds.getNumOfRedCards(), reds.getNumOfRedCards());
        System.out.println(reds.toString());

    }
}
