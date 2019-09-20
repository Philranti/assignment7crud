package za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.TransferListed;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.TransferListedFactory;


public class TransferListTest {
    TransferListed transferListTest;

    @Before
    public void setUp(){
        transferListTest = TransferListedFactory.createTransferList("Ross Barkley", "Arsenal");
    }

    @Test
    public void createTransferList(){

        Assert.assertEquals(transferListTest.getTeamInterested(), transferListTest.getTeamInterested());
        transferListTest.toString();
    }

}
