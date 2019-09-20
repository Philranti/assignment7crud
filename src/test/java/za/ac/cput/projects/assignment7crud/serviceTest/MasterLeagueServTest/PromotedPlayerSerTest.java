package za.ac.cput.projects.assignment7crud.serviceTest.MasterLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.PromotePlayers;
import za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory.PromotedPlayerFactory;
import za.ac.cput.projects.assignment7crud.repositories.masterleague_repository.PromotedPlayerRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PromotedPlayerSerTest {

    private PromotedPlayerRepositories repository;
    private PromotePlayers promotePlayers;

    private PromotePlayers getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PromotedPlayerRepositories.getRepository();
        this.promotePlayers = promotePlayers = PromotedPlayerFactory.promotePlayers("Marcus Rashford");
    }

    @Test
    public void a_create() {
        PromotePlayers created = this.repository.create(this.promotePlayers);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.promotePlayers);
    }

    @Test
    public void c_update() {
        String promotedPlayer = "Phillip Foden";
        PromotePlayers updated = new PromotePlayers.Builder().promotedPlayer(promotedPlayer).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(promotedPlayer, updated.getPromotedPlayer());
    }

    @Test
    public void e_delete() {
        PromotePlayers saved = getSaved();
        this.repository.delete(saved.getPromotedPlayer());
        d_getAll();
    }

    @Test
    public void b_read() {
        PromotePlayers saved = getSaved();
        PromotePlayers read = this.repository.read(saved.getPromotedPlayer());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<PromotePlayers> PromotePlayers = this.repository.getAll();
        System.out.println("In getall, all = " + PromotePlayers);
    }
}
