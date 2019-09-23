package za.ac.cput.projects.assignment7crud.serviceTest.PlayerStatsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostCleanSheets;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostCleanSheetsFactory;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostCleanSheetsRepositories;

import java.util.Set;

public class MostCleansheetSerTest {
    private MostCleanSheetsRepositories repository;
    private MostCleanSheets mostCleanSheets;

    private MostCleanSheets getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostCleanSheetsRepositories.getRepository();
        this.mostCleanSheets = MostCleanSheetsFactory.createMostCleanSheets(15, 9);
    }

    @Test
    public void a_create() {
        MostCleanSheets created = this.repository.create(this.mostCleanSheets);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mostCleanSheets);
    }

    @Test
    public void c_update() {
        int mostCleanSheets = 20;
        MostCleanSheets updated = new MostCleanSheets.Builder().numOfCleanSheets(mostCleanSheets).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(mostCleanSheets, updated.getNumOfCleanSheets());
    }

   /* @Test
    public void e_delete() {
        MostCleanSheets saved = getSaved();
        this.repository.delete(saved.getNumOfCleanSheets());
        d_getAll();
    }*/

   /* @Test
    public void b_read() {
        MostCleanSheets saved = getSaved();
        MostCleanSheets read = this.repository.read(saved.getNumOfCleanSheets());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<MostCleanSheets> MostCleanSheets = this.repository.getAll();
        System.out.println("In getall, all = " + MostCleanSheets);
    }

}
