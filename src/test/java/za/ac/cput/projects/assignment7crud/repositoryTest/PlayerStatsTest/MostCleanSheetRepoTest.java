package za.ac.cput.projects.assignment7crud.repositoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostCleanSheets;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostCleanSheetsFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest.MostCleanSheetTest;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostCleanSheetsRepositories;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostCleanSheetsRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MostCleanSheetRepoTest {
    MostCleanSheets cleanSheet;

    private MostCleanSheetsRepository repository;
    private MostCleanSheetTest mostCleanSheetTest;


    private MostCleanSheets getSavedMostCleanSheets() {
        Set<MostCleanSheets> savedMostCleanSheetsTransfer = this.repository.getAll();
        return savedMostCleanSheetsTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostCleanSheetsRepositories.getRepository();
      //  this.cleanSheet = mostCleanSheetTest.setUp();
    }

    @Test
    public void create() {
        MostCleanSheets created = this.repository.create(this.cleanSheet);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.cleanSheet);
    }

   /* @Test
    public void read() {
        MostCleanSheets savedMostCleanSheets = getSavedMostCleanSheets();

        MostCleanSheets read = this.repository.read(String.valueOf(savedMostCleanSheets.getNumOfCleanSheets()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMostCleanSheets, read);
    }*/

    private MostCleanSheets getsavedMostCleanSheetsTransfer() {
        Set<MostCleanSheets> savedMostCleanSheetsTransfer = this.repository.getAll();
        return savedMostCleanSheetsTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        MostCleanSheets savedMostCleanSheets = getSavedMostCleanSheets();
        this.repository.delete(String.valueOf(savedMostCleanSheets.getNumOfCleanSheets()));
        getAll();
    }*/

    @Test
    public void update() {
        int createMostCleanSheets = 13;
        MostCleanSheets MostCleanSheets = new MostCleanSheets.Builder().numOfCleanSheets(createMostCleanSheets).build();
        System.out.println("In update, about_to_updated = " +MostCleanSheets);
        MostCleanSheets updated = this.repository.update(MostCleanSheets);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createMostCleanSheets, updated.getNumOfCleanSheets());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MostCleanSheets> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
