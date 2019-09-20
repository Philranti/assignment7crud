package za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostYellowCards;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostYellowCardsFactory;

public class MostYellowCardTest {
    MostYellowCards yellowCards;

    @Before
    public void setUp(){
        yellowCards = MostYellowCardsFactory.createMostYellowCards(22);
    }

    @Test
    public void createYellowCard(){

        Assert.assertEquals(yellowCards.getNumOfYellowCards(), yellowCards.getNumOfYellowCards());
        System.out.println(yellowCards.toString());
    }
}
