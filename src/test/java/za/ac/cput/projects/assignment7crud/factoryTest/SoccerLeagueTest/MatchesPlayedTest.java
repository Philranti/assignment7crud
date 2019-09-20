package za.ac.cput.projects.assignment7crud.factoryTest.SoccerLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.MatchePlayed;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.MatchesPlayedFactory;

public class MatchesPlayedTest {
    MatchePlayed matches;

    @Before
    public void setUp(){
    matches = MatchesPlayedFactory.createMatchesPlayed(38,30,6,2);
    }

    @Test
    public void createMatchesPlayed(){

        Assert.assertEquals(matches.getMatchesWon(), matches.getMatchesWon());
        System.out.println(matches.toString());
    }
}
