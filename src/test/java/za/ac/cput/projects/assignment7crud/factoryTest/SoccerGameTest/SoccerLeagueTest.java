package za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.SoccerLeagueFactory;

public class SoccerLeagueTest {
    SoccerLeague soccerLeague;

    @Before
    public void setUp() {
         soccerLeague = SoccerLeagueFactory.createSoccerLeague("Italian Serie A", 38, 20);
    }

    @Test
    public void createSoccerLeague(){

        Assert.assertEquals(soccerLeague.getNameOfLeague(), soccerLeague.getNameOfLeague());
        System.out.println(soccerLeague.toString());
    }
}
