package za.ac.cput.projects.assignment7crud.serviceTest.ExhibitionServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.ChooseTeamFactory;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.ChooseTeamRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChooseTeamSerTest {
    
    private ChooseTeamRepositories repository;
    private ChooseTeams international;

    private ChooseTeams getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ChooseTeamRepositories.getRepository();
        this.international = ChooseTeamFactory.createTeams("Barcelona", "Real Madrid");
    }

    @Test
    public void a_create() {
        ChooseTeams created = this.repository.create(this.international);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.international);
    }

    @Test
    public void c_update() {
        String chooseTeamA = "Manchester City";
        ChooseTeams updated = new ChooseTeams.Builder().chooseTeamA(chooseTeamA).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(chooseTeamA, updated.getChooseTeamA());
    }

    @Test
    public void e_delete() {
        ChooseTeams saved = getSaved();
        this.repository.delete(saved.getChooseTeamA());
        d_getAll();
    }

    @Test
    public void b_read() {
        ChooseTeams saved = getSaved();
        ChooseTeams read = this.repository.read(saved.getChooseTeamA());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<ChooseTeams> ChooseTeams = this.repository.getAll();
        System.out.println("In getall, all = " + ChooseTeams);
    }
}
