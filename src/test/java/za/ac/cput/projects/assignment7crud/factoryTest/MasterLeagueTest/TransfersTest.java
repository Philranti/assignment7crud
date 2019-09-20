package za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.Transfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.TransfersFactory;

public class TransfersTest {
    Transfers transfers;

    @Before
    public void setUp(){
        transfers = TransfersFactory.createTransfers(5,25,"Striker", "Everton", "Liverpool");
    }

    @Test
    public void createTransfers(){

        Assert.assertEquals(transfers.getPlayersPosition(), transfers.getPlayersPosition());
        System.out.println(transfers.toString());
    }
}
