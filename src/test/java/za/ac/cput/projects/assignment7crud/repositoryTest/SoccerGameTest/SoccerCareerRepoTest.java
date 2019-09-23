package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.CareerFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest.SoccerCareerTest;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.SoccerCareerRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.SoccerCareerRepository;

import java.util.Set;

public class SoccerCareerRepoTest {
    private SoccerCareerLeague career;

    private SoccerCareerRepository repository;
    private SoccerCareerTest soccerCareerLeagueTest;


    private SoccerCareerLeague getSavedSoccerCareerLeague() {
        Set<SoccerCareerLeague> savedSoccerCareerLeague = this.repository.getAll();
        return savedSoccerCareerLeague.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SoccerCareerRepositories.getRepository();
     //   this.career = soccerCareerLeagueTest.setUp();
    }

    @Test
    public void create() {
        SoccerCareerLeague created = this.repository.create(this.career);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.career);
    }

   /* @Test
    public void read() {
        SoccerCareerLeague savedSoccerCareerLeague = getSavedSoccerCareerLeague();

        SoccerCareerLeague read = this.repository.read(String.valueOf(Integer.parseInt(savedSoccerCareerLeague.getTeamCareerChosen())));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedSoccerCareerLeague, read);
    }*/

    private SoccerCareerLeague getsavedSoccerCareerLeagueTransfer() {
        Set<SoccerCareerLeague> savedSoccerCareerLeagueTransfer = this.repository.getAll();
        return savedSoccerCareerLeagueTransfer.iterator().next();
    }

  /*  @Test
    public void delete() {
        SoccerCareerLeague savedSoccerCareerLeague = getSavedSoccerCareerLeague();
        this.repository.delete(String.valueOf(Integer.parseInt(savedSoccerCareerLeague.getTeamCareerChosen())));
        getAll();
    }*/

    @Test
    public void update() {
        String createSoccerCareerLeague = "Player Career";
        SoccerCareerLeague SoccerCareerLeague = new SoccerCareerLeague.Builder().teamCareerChosen(createSoccerCareerLeague).build();
        System.out.println("In update, about_to_updated = " +SoccerCareerLeague);
        SoccerCareerLeague updated = this.repository.update(SoccerCareerLeague);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createSoccerCareerLeague, updated.getTeamCareerChosen());
        getAll();
    }

    @Test
    public void getAll() {
        Set<SoccerCareerLeague> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
