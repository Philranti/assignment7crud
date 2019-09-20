package za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.NewTransfers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.NewTransferFactory;

public class NewTransferTest {
    private NewTransfers newTransfers;

    @Before
    public void setUp(){

        newTransfers = NewTransferFactory.createNewTransfers("Lionel Messi", 60000);
    }

    @Test
    public void createNewTransfer(){

        Assert.assertEquals(newTransfers.getNewPlayerName(), newTransfers.getNewPlayerName());
        System.out.println(newTransfers.toString());
    }
}
