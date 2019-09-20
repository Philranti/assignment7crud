package za.ac.cput.projects.assignment7crud.serviceTest.PlayerStatsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.PlayerStats;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.PlayerStatsFactory;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.PlayerStatsRepositories;

import java.util.Set;

public class PlayerStatsSerTest {
    private PlayerStatsRepositories repository;
    private PlayerStats PlayerStats;

    private PlayerStats getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PlayerStatsRepositories.getRepository();
        this.PlayerStats = PlayerStatsFactory.createPlayerStats("Raheem Sterling");
    }

    @Test
    public void a_create() {
        PlayerStats created = this.repository.create(this.PlayerStats);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.PlayerStats);
    }

    @Test
    public void c_update() {
        String renamePlayerStats = "Jordan Henderson";
        PlayerStats updated = new PlayerStats.Builder().playerName(renamePlayerStats).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(renamePlayerStats, updated.getPlayerName());
    }

    @Test
    public void e_delete() {
        PlayerStats saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getPlayerName()));
        d_getAll();
    }

    @Test
    public void b_read() {
        PlayerStats saved = getSaved();
        PlayerStats read = this.repository.read(Integer.parseInt(saved.getPlayerName()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<PlayerStats> PlayerStats = this.repository.getAll();
        System.out.println("In getall, all = " + PlayerStats);
    }

}
