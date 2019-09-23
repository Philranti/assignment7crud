package za.ac.cput.projects.assignment7crud.repositoryTest.MasterLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.PromotePlayers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.PromotedPlayerFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.MasterLeagueTest.PromotePlayerTest;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.PromotedPlayerRepositories;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.PromotedPlayerRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PromotePlayerRepoTest {
    PromotePlayers promotePlayers;

    private PromotedPlayerRepository repository;
    private PromotePlayerTest PromotePlayersTest;


    private PromotePlayers getSavedPromotePlayers() {
        Set<PromotePlayers> savedpromotePlayersTransfer = this.repository.getAll();
        return savedpromotePlayersTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PromotedPlayerRepositories.getRepository();
     //   this.promotePlayers = PromotePlayersTest.setUp();
    }

    @Test
    public void create() {
        PromotePlayers created = this.repository.create(this.promotePlayers);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.promotePlayers);
    }

  /*  @Test
    public void read() {
        PromotePlayers savedPromotePlayers = getSavedPromotePlayers();

        PromotePlayers read = this.repository.read(savedPromotePlayers.getPromotedPlayer());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedPromotePlayers, read);
    }*/

    private PromotePlayers getsavedpromotePlayersTransfer() {
        Set<PromotePlayers> savedpromotePlayersTransfer = this.repository.getAll();
        return savedpromotePlayersTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        PromotePlayers savedPromotePlayers = getSavedPromotePlayers();
        this.repository.delete(savedPromotePlayers.getPromotedPlayer());
        getAll();
    }*/

    @Test
    public void update() {
        String promotedPlayerName = "Phillip Foden";
        PromotePlayers PromotePlayers = new PromotePlayers.Builder().promotedPlayer(promotedPlayerName).build();
        System.out.println("In update, about_to_updated = " +PromotePlayers);
        PromotePlayers updated = this.repository.update(PromotePlayers);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(promotedPlayerName, updated.getPromotedPlayer());
        getAll();
    }

    @Test
    public void getAll() {
        Set<PromotePlayers> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
