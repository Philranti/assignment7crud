package za.ac.cput.projects.assignment7crud.repositoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.TopGoalScorers;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.TopScorerFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest.TopScorerTest;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.TopScorerRepositories;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.TopScorerRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TopScorerRepoTest {
    TopGoalScorers scorers;

    private TopScorerRepository repository;
    private TopScorerTest topScorersTest;


    private TopGoalScorers getSavedTopGoalScorers() {
        Set<TopGoalScorers> savedTopGoalScorersTransfer = this.repository.getAll();
        return savedTopGoalScorersTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TopScorerRepositories.getRepository();
     //   this.scorers = topScorersTest.setUp();
    }

    @Test
    public void create() {
        TopGoalScorers created = this.repository.create(this.scorers);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.scorers);
    }

/*    @Test
    public void read() {
        TopGoalScorers savedTopGoalScorers = getSavedTopGoalScorers();

        TopGoalScorers read = this.repository.read(String.valueOf(savedTopGoalScorers.getNumOfGoalsScored()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedTopGoalScorers, read);
    }*/

    private TopGoalScorers getsavedTopGoalScorersTransfer() {
        Set<TopGoalScorers> savedTopGoalScorersTransfer = this.repository.getAll();
        return savedTopGoalScorersTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        TopGoalScorers savedTopGoalScorers = getSavedTopGoalScorers();
        this.repository.delete(String.valueOf(savedTopGoalScorers.getNumOfGoalsScored()));
        getAll();
    }*/

    @Test
    public void update() {
        int topGoalScorers = 60;
        TopGoalScorers TopGoalScorers = new TopGoalScorers.Builder().numOfGoalsScored(topGoalScorers).build();
        System.out.println("In update, about_to_updated = " +TopGoalScorers);
        TopGoalScorers updated = this.repository.update(TopGoalScorers);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(topGoalScorers, updated.getNumOfGoalsScored());
        getAll();
    }

    @Test
    public void getAll() {
        Set<TopGoalScorers> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
