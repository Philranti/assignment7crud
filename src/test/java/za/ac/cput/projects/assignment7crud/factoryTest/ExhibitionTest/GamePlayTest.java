package za.ac.cput.projects.assignment7crud.factoryTest.ExhibitionTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.GamePlayFactory;


public class GamePlayTest {
    private GamePlay game;

    @Before
    public void setup(){
        game = GamePlayFactory.createGamePlay("Two Player", 30, true, true, 6, "Old Trafford" );
    }

    @Test
    public void createGamePlay(){

        Assert.assertEquals(game.getPlayerMode(), game.getPlayerMode());
        System.out.println(game.toString());

    }
}
