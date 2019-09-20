package za.ac.cput.projects.assignment7crud.repositoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostAssists;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostAssistFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest.MostAssistTest;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostAssistRepositories;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostAssistRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MostAssistRepoTest {
    MostAssists assists;

    private MostAssistRepository repository;
    MostAssistTest tests;


    private MostAssists getSavedMostAssists() {
        Set<MostAssists> savedMostAssists = this.repository.getAll();
        return savedMostAssists.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostAssistRepositories.getRepository();
        //this.assists = tests.setUp();
    }

    @Test
    public void create() {
        MostAssists created = this.repository.create(this.assists);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.assists);
    }

    @Test
    public void read() {
        MostAssists savedMostAssists = getSavedMostAssists();

        MostAssists read = this.repository.read(String.valueOf(savedMostAssists.getNumOfAssist()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMostAssists, read);
    }

    private MostAssists getsavedMostAssistsTransfer() {
        Set<MostAssists> savedMostAssistsTransfer = this.repository.getAll();
        return savedMostAssistsTransfer.iterator().next();
    }

    @Test
    public void delete() {
        MostAssists savedMostAssists = getSavedMostAssists();
        this.repository.delete(savedMostAssists.getPlayerName());
        getAll();
    }

    @Test
    public void update() {
        int createMostAssists = 50;
        MostAssists MostAssists = new MostAssists.Builder().numOfAssist(createMostAssists).build();
        System.out.println("In update, about_to_updated = " +MostAssists);
        MostAssists updated = this.repository.update(MostAssists);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createMostAssists, updated.getNumOfAssist());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MostAssists> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
