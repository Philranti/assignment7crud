package za.ac.cput.projects.assignment7crud.serviceTest.PlayerStatsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.TopGoalScorers;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.TopScorerFactory;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.TopScorerRepositories;

import java.util.Set;

public class TopScorerSerTest {

    private TopScorerRepositories repository;
    private TopGoalScorers TopGoalScorers;

    private TopGoalScorers getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TopScorerRepositories.getRepository();
        this.TopGoalScorers = TopScorerFactory.createTopScorer(30);
    }

    @Test
    public void a_create() {
        TopGoalScorers created = this.repository.create(this.TopGoalScorers);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.TopGoalScorers);
    }

    @Test
    public void c_update() {
        int numOfGoalScored = 32;
        TopGoalScorers updated = new TopGoalScorers.Builder().numOfGoalsScored(numOfGoalScored).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(numOfGoalScored, updated.getNumOfGoalsScored());
    }

   /* @Test
    public void e_delete() {
        TopGoalScorers saved = getSaved();
        this.repository.delete(saved.getNumOfGoalsScored());
        d_getAll();
    }*/

  /*  @Test
    public void b_read() {
        TopGoalScorers saved = getSaved();
        TopGoalScorers read = this.repository.read(saved.getNumOfGoalsScored());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<TopGoalScorers> TopGoalScorers = this.repository.getAll();
        System.out.println("In getall, all = " + TopGoalScorers);
    }

}
