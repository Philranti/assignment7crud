package za.ac.cput.projects.assignment7crud.serviceTest.PlayerStatsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostAssists;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostAssistFactory;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostAssistRepositories;

import java.util.Set;

public class MostAssistSerTest {

    private MostAssistRepositories repository;
    private MostAssists MostAssists;

    private MostAssists getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostAssistRepositories.getRepository();
        this.MostAssists = MostAssistFactory.createMostAssist(20);
    }

    @Test
    public void a_create() {
        MostAssists created = this.repository.create(this.MostAssists);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.MostAssists);
    }

    @Test
    public void c_update() {
        int numOfAssist = 25;
        MostAssists updated = new MostAssists.Builder().numOfAssist(numOfAssist).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(numOfAssist, updated.getNumOfAssist());
    }

    @Test
    public void e_delete() {
        MostAssists saved = getSaved();
        this.repository.delete(Integer.parseInt(String.valueOf(saved.getNumOfAssist())));
        d_getAll();
    }

    @Test
    public void b_read() {
        MostAssists saved = getSaved();
        MostAssists read = this.repository.read(saved.getNumOfAssist());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<MostAssists> MostAssists = this.repository.getAll();
        System.out.println("In getall, all = " + MostAssists);
    }

}
