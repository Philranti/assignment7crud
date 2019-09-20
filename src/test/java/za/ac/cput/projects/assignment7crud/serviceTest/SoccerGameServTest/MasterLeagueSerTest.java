package za.ac.cput.projects.assignment7crud.serviceTest.SoccerGameServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.MasterLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.MasterLeagueFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.MasterLeagueRepositories;

import java.util.Set;

public class MasterLeagueSerTest {
    private MasterLeagueRepositories repository;
    private MasterLeague masterLeague;

    private MasterLeague getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MasterLeagueRepositories.getRepository();
        this.masterLeague = MasterLeagueFactory.createMasterLeage("English", "Manchester City");
    }

    @Test
    public void a_create() {
        MasterLeague created = this.repository.create(this.masterLeague);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.masterLeague);
    }

    @Test
    public void c_update() {
        String masterLeagueName = "German Bundesliga";
        MasterLeague updated = new MasterLeague.Builder().masterLeagueName(masterLeagueName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(masterLeagueName, updated.getMasterLeagueName());
    }

    @Test
    public void e_delete() {
        MasterLeague saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getMasterLeagueName()));
        d_getAll();
    }

    @Test
    public void b_read() {
        MasterLeague saved = getSaved();
        MasterLeague read = this.repository.read(Integer.parseInt(saved.getMasterLeagueName()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<MasterLeague> MasterLeague = this.repository.getAll();
        System.out.println("In getall, all = " + MasterLeague);
    }

}
