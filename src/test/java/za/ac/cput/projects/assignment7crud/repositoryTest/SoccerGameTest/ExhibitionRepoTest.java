package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.ExhibitionMatch;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.ExhibitionFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest.ExhibitionTest;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.ExhibitionRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.ExhibitionRepository;

import java.util.Set;

public class ExhibitionRepoTest {
    ExhibitionMatch exhibitionMatch;

    private ExhibitionRepository repository;
    private ExhibitionTest exhibitionMatchTest;


    private ExhibitionMatch getSavedExhibitionMatch() {
        Set<ExhibitionMatch> savedExhibitionMatch = this.repository.getAll();
        return savedExhibitionMatch.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ExhibitionRepositories.getRepository();
      //  this.exhibitionMatch = exhibitionMatchTest.setUp();
    }

    @Test
    public void create() {
        ExhibitionMatch created = this.repository.create(this.exhibitionMatch);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.exhibitionMatch);
    }

/*    @Test
    public void read() {
        ExhibitionMatch savedExhibitionMatch = getSavedExhibitionMatch();

        ExhibitionMatch read = this.repository.read(savedExhibitionMatch.getPlayerWon());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedExhibitionMatch, read);
    }*/

    private ExhibitionMatch getsavedExhibitionMatchTransfer() {
        Set<ExhibitionMatch> savedExhibitionMatchTransfer = this.repository.getAll();
        return savedExhibitionMatchTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        ExhibitionMatch savedExhibitionMatch = getSavedExhibitionMatch();
        this.repository.delete(savedExhibitionMatch.getPlayerWon());
        getAll();
    }*/

    @Test
    public void update() {
        String createExhibitionMatch = "Player Two";
        ExhibitionMatch playerWon = new ExhibitionMatch.Builder().playerWon(createExhibitionMatch).build();
        System.out.println("In update, about_to_updated = " +playerWon);
        ExhibitionMatch updated = this.repository.update(playerWon);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createExhibitionMatch, updated.getPlayerWon());
        getAll();
    }

    @Test
    public void getAll() {
        Set<ExhibitionMatch> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
