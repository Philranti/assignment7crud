package za.ac.cput.projects.assignment7crud.serviceTest.PlayerStatsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostYellowCards;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostYellowCardsFactory;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostYellowCardRepositories;

import java.util.Set;

public class MostYellowCardSerTest {
    private MostYellowCardRepositories repository;
    private MostYellowCards MostYellowCards;

    private MostYellowCards getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostYellowCardRepositories.getRepository();
        this.MostYellowCards = MostYellowCardsFactory.createMostYellowCards(22);
    }

    @Test
    public void a_create() {
        MostYellowCards created = this.repository.create(this.MostYellowCards);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.MostYellowCards);
    }

    @Test
    public void c_update() {
        int mostYellowCards = 25;
        MostYellowCards updated = new MostYellowCards.Builder().numOfYellowCards(mostYellowCards).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(mostYellowCards, updated.getNumOfYellowCards());
    }

   /* @Test
    public void e_delete() {
        MostYellowCards saved = getSaved();
        this.repository.delete(saved.getNumOfYellowCards());
        d_getAll();
    }*/

   /* @Test
    public void b_read() {
        MostYellowCards saved = getSaved();
        MostYellowCards read = this.repository.read(saved.getNumOfYellowCards());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<MostYellowCards> MostYellowCards = this.repository.getAll();
        System.out.println("In getall, all = " + MostYellowCards);
    }

}
