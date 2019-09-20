package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.Divisions;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.DivisionFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerLeagueTest.DivisionsTest;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.DivisionsRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.DivisionsRepository;

import java.util.Set;

public class DivisionsRepoTest {
    Divisions div;

    private DivisionsRepository repository;
    private DivisionsTest divisionsTest;


    private Divisions getSavedDivisions() {
        Set<Divisions> savedDivisions = this.repository.getAll();
        return savedDivisions.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DivisionsRepositories.getRepository();
     //   this.div = divisionsTest.setUp();
    }

    @Test
    public void create() {
        Divisions created = this.repository.create(this.div);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.div);
    }

    @Test
    public void read() {
        Divisions savedDivisions = getSavedDivisions();

        Divisions read = this.repository.read(Integer.parseInt(savedDivisions.getCurrentChampions()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedDivisions, read);
    }

    private Divisions getsavedDivisionsTransfer() {
        Set<Divisions> savedDivisionsTransfer = this.repository.getAll();
        return savedDivisionsTransfer.iterator().next();
    }

    @Test
    public void delete() {
        Divisions savedDivisions = getSavedDivisions();
        this.repository.delete(savedDivisions.getCurrentChampions());
        getAll();
    }

    @Test
    public void update() {
        String createDivisions = "Chiefs";
        Divisions Divisions = new Divisions.Builder().currentChampions(createDivisions).build();
        System.out.println("In update, about_to_updated = " +Divisions);
        Divisions updated = this.repository.update(Divisions);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createDivisions, updated.getCurrentChampions());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Divisions> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
