package za.ac.cput.projects.assignment7crud.repositoryTest.ExhibitionTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.ChooseTeamFactory;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.ChooseTeamsRepository;

import java.util.List;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChooseTeamRepoTest {
    private ChooseTeams teams;

    private ChooseTeamsRepository repository;



    private ChooseTeams getSavedChooseTeams() {
        List<ChooseTeams> savedClubs = this.repository.findAll();
        return savedClubs.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
       // this.repository = ChooseTeamRepositories.getRepository();
        this.teams = ChooseTeamFactory.createTeams("Barcelona", "Real Madrid");
    }

    private ChooseTeams getSavedClub() {
        List<ChooseTeams> savedChooseTeams = this.repository.findAll();
        return savedChooseTeams.iterator().next();
    }

    @Test
    public void a_create() {
        ChooseTeams created = this.repository.save(this.teams);
        System.out.println("In create, created = " + created);
        c_getAll();
        Assert.assertSame(created, this.teams);
    }

    @Test
    public void b_read() {
       ChooseTeams savedTeams = getSavedChooseTeams();
        System.out.println("In read, club tournamentId = "+ savedTeams.getChooseTeamA());
       // ChooseTeams read = this.repository.read(savedTeams.getChooseTeamA());
        System.out.println("In read, read = " + savedTeams);
        c_getAll();
        Assert.assertNotNull(savedTeams);
    }



    @Test
    public void e_delete() {
        ChooseTeams savedChooseTeams = getSavedChooseTeams();
        this.repository.deleteById(savedChooseTeams.getTeamId());
        c_getAll();
    }

    @Test
    public void d_update() {
        String clubName = "Arsenal";
        ChooseTeams club = new ChooseTeams.Builder().chooseTeamA(clubName).build();
        System.out.println("In update, about_to_updated = " +club);
        ChooseTeams updated = this.repository.save(club);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(clubName, updated.getChooseTeamA());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        List<ChooseTeams> all = this.repository.findAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
