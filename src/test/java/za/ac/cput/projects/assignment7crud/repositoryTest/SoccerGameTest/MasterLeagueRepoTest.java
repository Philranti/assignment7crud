package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.MasterLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.MasterLeagueFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest.MasterLeagueTest;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.MasterLeagueRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.MasterLeagueRepository;

import java.util.Set;

public class MasterLeagueRepoTest {
    MasterLeague master;

    private MasterLeagueRepository repository;
    private MasterLeagueTest masterLeagueTest;


    private MasterLeague getSavedMasterLeague() {
        Set<MasterLeague> savedMasterLeague = this.repository.getAll();
        return savedMasterLeague.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MasterLeagueRepositories.getRepository();
     //   this.master = masterLeagueTest.setUp();
    }

    @Test
    public void create() {
        MasterLeague created = this.repository.create(this.master);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.master);
    }

/*    @Test
    public void read() {
        MasterLeague savedMasterLeague = getSavedMasterLeague();

        MasterLeague read = this.repository.read(savedMasterLeague.getTeamChosen());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMasterLeague, read);
    }*/

    private MasterLeague getsavedMasterLeagueTransfer() {
        Set<MasterLeague> savedMasterLeagueTransfer = this.repository.getAll();
        return savedMasterLeagueTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        MasterLeague savedMasterLeague = getSavedMasterLeague();
        this.repository.delete(savedMasterLeague.getTeamChosen());
        getAll();
    }*/

    @Test
    public void update() {
       String createTeamChosen = "Bayern Munich";
        MasterLeague MasterLeague = new MasterLeague.Builder().teamChosen(createTeamChosen).build();
        System.out.println("In update, about_to_updated = " +MasterLeague);
        MasterLeague updated = this.repository.update(MasterLeague);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createTeamChosen, updated.getTeamChosen());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MasterLeague> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
