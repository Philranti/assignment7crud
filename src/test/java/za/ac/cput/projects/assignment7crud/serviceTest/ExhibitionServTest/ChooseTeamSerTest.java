package za.ac.cput.projects.assignment7crud.serviceTest.ExhibitionServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.ChooseTeamFactory;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.ChooseTeamsRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChooseTeamSerTest {
    @Autowired
    private ChooseTeamsRepository repository;
    private ChooseTeams international;

    private ChooseTeams getSaved(){
        return this.repository.findAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
       // this.repository = ChooseTeamRepositories.getRepository();
        this.international = ChooseTeamFactory.createTeams("Barcelona", "Real Madrid");
    }

    @Test
    public void a_create() {
        ChooseTeams created = this.repository.save(this.international);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.international);
    }

    @Test
    public void c_update() {
        String chooseTeamA = "Manchester City";
        ChooseTeams updated = new ChooseTeams.Builder().chooseTeamA(chooseTeamA).build();
        System.out.println("In update, updated = " + updated);
        this.repository.save(updated);
        Assert.assertSame(chooseTeamA, updated.getChooseTeamA());
    }

    @Test
    public void e_delete() {
        ChooseTeams saved = getSaved();
        this.repository.deleteById(saved.getTeamId());
        d_getAll();
    }

    @Test
    public void b_read() {
        ChooseTeams saved = getSaved();
      Optional<ChooseTeams> read = this.repository.findById(saved.getChooseTeamA());
        System.out.println("In read, read = " + read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        List<ChooseTeams> ChooseTeams = this.repository.findAll();
        System.out.println("In getall, all = " + ChooseTeams);
    }
}
