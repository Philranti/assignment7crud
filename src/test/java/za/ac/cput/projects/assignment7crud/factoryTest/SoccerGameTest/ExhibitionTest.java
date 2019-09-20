package za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.ExhibitionMatch;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.ExhibitionFactory;

public class ExhibitionTest {
    ExhibitionMatch exhibitionMatch;

    @Before
    public void setUp() {
        exhibitionMatch = ExhibitionFactory.createExhibition("1-0", "Player One",false);
    }

    @Test
    public void createExhibition(){

        Assert.assertEquals(exhibitionMatch.getScoreResult(), exhibitionMatch.getScoreResult());
        System.out.println(exhibitionMatch.toString());
    }
}
