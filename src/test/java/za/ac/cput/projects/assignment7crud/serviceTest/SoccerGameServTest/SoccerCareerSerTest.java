package za.ac.cput.projects.assignment7crud.serviceTest.SoccerGameServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.CareerFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.SoccerCareerRepositories;

import java.util.Set;

public class SoccerCareerSerTest {

    private SoccerCareerRepositories repository;
    private SoccerCareerLeague soccerCareerLeague;

    private SoccerCareerLeague getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SoccerCareerRepositories.getRepository();
        this.soccerCareerLeague = CareerFactory.createCareer("Coaching Career", "Barcelona" );
    }

    @Test
    public void a_create() {
        SoccerCareerLeague created = this.repository.create(this.soccerCareerLeague);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.soccerCareerLeague);
    }

    @Test
    public void c_update() {
        String renameSoccerCareerLeague = "Real Madrid";
        SoccerCareerLeague updated = new SoccerCareerLeague.Builder().teamCareerChosen(renameSoccerCareerLeague).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(renameSoccerCareerLeague, updated.getTeamCareerChosen());
    }

    @Test
    public void e_delete() {
        SoccerCareerLeague saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getTeamCareerChosen()));
        d_getAll();
    }

    @Test
    public void b_read() {
        SoccerCareerLeague saved = getSaved();
        SoccerCareerLeague read = this.repository.read(Integer.parseInt(saved.getTeamCareerChosen()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<SoccerCareerLeague> SoccerCareerLeague = this.repository.getAll();
        System.out.println("In getall, all = " + SoccerCareerLeague);
    }

}
