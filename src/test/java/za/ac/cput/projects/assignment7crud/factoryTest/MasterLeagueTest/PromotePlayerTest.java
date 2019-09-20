package za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.PromotePlayers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.PromotedPlayerFactory;

public class PromotePlayerTest {
    PromotePlayers promotePlayers;

    @Before
    public void setUp(){
         promotePlayers = PromotedPlayerFactory.promotePlayers("Marcus Rashford");
    }

    @Test
    public void createPromotedPlayer(){

        Assert.assertEquals(promotePlayers.getPromotedPlayer(), promotePlayers.getPromotedPlayer());
        System.out.println(promotePlayers.toString());

    }
}
