package za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerGame;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.SoccerGameFactory;


public class SoccerGameTest {
    private SoccerGame soccer;

    @Before
    public void setUp() {
        soccer = SoccerGameFactory.createSoccerGame(29300,"FIFA 19", "Professional", 15);
    }

    @Test
    public void createSoccerGame(){

        Assert.assertEquals(soccer.getGameType(), soccer.getGameType());
        System.out.println(soccer.toString());
    }
}
