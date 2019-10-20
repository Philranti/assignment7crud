package za.ac.cput.projects.assignment7crud.factoryTest.NewGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;

public class NewGameTests {
    private NewGame newGame;

    @Before
    public void setUp(){
        newGame = CreateNewGameFactory.newGame(newGame.getGameId(), "PhillipMphelaGame", "PhilGame" );
    }

    @Test
    public void createNewGame(){

        Assert.assertEquals(newGame.getCreateName(), newGame.getCreateName());
        System.out.println(newGame.toString());

    }

}
