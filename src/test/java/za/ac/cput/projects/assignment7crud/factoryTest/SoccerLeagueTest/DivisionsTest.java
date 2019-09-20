package za.ac.cput.projects.assignment7crud.factoryTest.SoccerLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.Divisions;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.DivisionFactory;

public class DivisionsTest {
    Divisions div;

    @Before
    public void setUp() {
        div = DivisionFactory.createDivisions("ABSA Premiership", 16, "Sundowns");
    }

    @Test
    public void createDivisions(){

        Assert.assertEquals(div.getDivisionPlayed(), div.getDivisionPlayed());
        Assert.assertEquals(div.getNumOfTeams(), div.getNumOfTeams());
        Assert.assertEquals(div.getCurrentChampions(), div.getCurrentChampions());
        System.out.println(div.toString());
    }
}
