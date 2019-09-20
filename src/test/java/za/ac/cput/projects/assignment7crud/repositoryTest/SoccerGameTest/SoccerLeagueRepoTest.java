package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.SoccerLeagueFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest.SoccerLeagueTest;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.SoccerLeagueRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.SoccerLeagueRepository;

import java.util.Set;

public class SoccerLeagueRepoTest {
    SoccerLeague soccerLeague;
    private SoccerLeagueRepository repository;
    private SoccerLeagueTest soccerLeagueTest;


    private SoccerLeague getSavedSoccerLeague() {
        Set<SoccerLeague> savedSoccerLeague = this.repository.getAll();
        return savedSoccerLeague.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SoccerLeagueRepositories.getRepository();
       // this.soccerLeague = soccerLeagueTest.setUp();
    }

    @Test
    public void create() {
        SoccerLeague created = this.repository.create(this.soccerLeague);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.soccerLeague);
    }

    @Test
    public void read() {
        SoccerLeague savedSoccerLeague = getSavedSoccerLeague();

        SoccerLeague read = this.repository.read(savedSoccerLeague.getNameOfLeague());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedSoccerLeague, read);
    }

    private SoccerLeague getsavedSoccerLeagueTransfer() {
        Set<SoccerLeague> savedSoccerLeagueTransfer = this.repository.getAll();
        return savedSoccerLeagueTransfer.iterator().next();
    }

    @Test
    public void delete() {
        SoccerLeague savedSoccerLeague = getSavedSoccerLeague();
        this.repository.delete(savedSoccerLeague.getNameOfLeague());
        getAll();
    }

    @Test
    public void update() {
        String createSoccerLeague = "Italian Serie A";
        SoccerLeague SoccerLeague = new SoccerLeague.Builder().nameOfLeague(createSoccerLeague).build();
        System.out.println("In update, about_to_updated = " +SoccerLeague);
        SoccerLeague updated = this.repository.update(SoccerLeague);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createSoccerLeague, updated.getNameOfLeague());
        getAll();
    }

    @Test
    public void getAll() {
        Set<SoccerLeague> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
