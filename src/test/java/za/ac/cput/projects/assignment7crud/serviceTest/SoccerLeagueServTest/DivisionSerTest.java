package za.ac.cput.projects.assignment7crud.serviceTest.SoccerLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.Divisions;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.DivisionFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.DivisionsRepositories;

import java.util.Set;

public class DivisionSerTest {

    private DivisionsRepositories repository;
    private Divisions div;

    private Divisions getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DivisionsRepositories.getRepository();
        this.div = DivisionFactory.createDivisions("ABSA Premiership", 16, "Sundowns");
    }

    @Test
    public void a_create() {
        Divisions created = this.repository.create(this.div);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.div);
    }

    @Test
    public void c_update() {
        String renameDivisions = "Italian Serie A";
        Divisions updated = new Divisions.Builder().divisionPlayed(renameDivisions).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(renameDivisions, updated.getDivisionPlayed());
    }

    @Test
    public void e_delete() {
        Divisions saved = getSaved();
        this.repository.delete(saved.getDivisionPlayed());
        d_getAll();
    }

    @Test
    public void b_read() {
        Divisions saved = getSaved();
        Divisions read = this.repository.read(Integer.parseInt(saved.getDivisionPlayed()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Divisions> Divisions = this.repository.getAll();
        System.out.println("In getall, all = " + Divisions);
    }

}
