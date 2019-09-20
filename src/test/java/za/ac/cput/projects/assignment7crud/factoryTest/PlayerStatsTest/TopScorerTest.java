package za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.TopGoalScorers;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.TopScorerFactory;

public class TopScorerTest {
    TopGoalScorers scorers;


    @Before
    public void setUp(){
        scorers = TopScorerFactory.createTopScorer(30);
    }

    @Test
    public void createTopScorer(){

        Assert.assertEquals(scorers.getNumOfGoalsScored(), scorers.getNumOfGoalsScored());
        System.out.println(scorers.toString());
    }
}
