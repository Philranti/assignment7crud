package za.ac.cput.projects.assignment7crud.repositoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.PlayerStats;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.PlayerStatsFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest.PlayerStatsTest;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.PlayerStatsRepositories;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.PlayerStatsRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlayerStatsRepoTest {
    PlayerStats playerStats;

    private PlayerStatsRepository repository;
    private PlayerStatsTest playerStatsTest;


    private PlayerStats getSavedPlayerStats() {
        Set<PlayerStats> savedPlayerStatsTransfer = this.repository.getAll();
        return savedPlayerStatsTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PlayerStatsRepositories.getRepository();
       // this.playerStats = playerStatsTest.setUp();
    }

    @Test
    public void create() {
        PlayerStats created = this.repository.create(this.playerStats);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.playerStats);
    }

    @Test
    public void read() {
        PlayerStats savedPlayerStats = getSavedPlayerStats();

        PlayerStats read = this.repository.read(savedPlayerStats.getPlayerName());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedPlayerStats, read);
    }

    private PlayerStats getsavedPlayerStatsTransfer() {
        Set<PlayerStats> savedPlayerStatsTransfer = this.repository.getAll();
        return savedPlayerStatsTransfer.iterator().next();
    }

    @Test
    public void delete() {
        PlayerStats savedPlayerStats = getSavedPlayerStats();
        this.repository.delete(savedPlayerStats.getPlayerName());
        getAll();
    }

    @Test
    public void update() {
        String createPlayerStatsName = "Paul Pogba";
        PlayerStats PlayerStats = new PlayerStats.Builder().playerName(createPlayerStatsName).build();
        System.out.println("In update, about_to_updated = " +PlayerStats);
        PlayerStats updated = this.repository.update(PlayerStats);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createPlayerStatsName, updated.getPlayerName());
        getAll();
    }

    @Test
    public void getAll() {
        Set<PlayerStats> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
