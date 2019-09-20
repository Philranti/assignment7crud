package za.ac.cput.projects.assignment7crud.factoryTest.SoccerCareerTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.PlayerCareer;
import za.ac.cput.projects.assignment7crud.factory.SoccerCareerFactory.PlayerCareerFactory;

public class PlayerCareerTest {
    PlayerCareer playerCareer;

    @Before
    public void setUp(){
        playerCareer = PlayerCareerFactory.createPlayerCareer("Chelsea", 6, 200, 53, 23);
    }

    @Test
    public void createPlayerCareer(){

        Assert.assertEquals(playerCareer.getTeamCareer(), playerCareer.getTeamCareer());
        System.out.println(playerCareer.toString());

    }
}
