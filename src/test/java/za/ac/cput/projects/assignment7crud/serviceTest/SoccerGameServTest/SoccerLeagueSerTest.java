package za.ac.cput.projects.assignment7crud.serviceTest.SoccerGameServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.SoccerLeagueFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.SoccerLeagueRepositories;

import java.util.Set;

public class SoccerLeagueSerTest {

    private SoccerLeagueRepositories repository;
    private SoccerLeague soccerLeague;

    private SoccerLeague getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SoccerLeagueRepositories.getRepository();
        this.soccerLeague = SoccerLeagueFactory.createSoccerLeague("Italian Serie A", 38, 20);
    }

    @Test
    public void a_create() {
        SoccerLeague created = this.repository.create(this.soccerLeague);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.soccerLeague);
    }

    @Test
    public void c_update() {
        String renameSoccerLeague = "Spanish La Liga";
        SoccerLeague updated = new SoccerLeague.Builder().nameOfLeague(renameSoccerLeague).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(renameSoccerLeague, updated.getNameOfLeague());
    }

   /* @Test
    public void e_delete() {
        SoccerLeague saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getNameOfLeague()));
        d_getAll();
    }  */


  /*  @Test
    public void b_read() {
        SoccerLeague saved = getSaved();
        SoccerLeague read = this.repository.read(Integer.parseInt(saved.getNameOfLeague()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<SoccerLeague> SoccerLeague = this.repository.getAll();
        System.out.println("In getall, all = " + SoccerLeague);
    }

}
