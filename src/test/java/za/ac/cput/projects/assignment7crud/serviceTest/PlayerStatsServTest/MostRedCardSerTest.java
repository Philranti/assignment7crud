package za.ac.cput.projects.assignment7crud.serviceTest.PlayerStatsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostRedCards;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostRedCardFactory;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostRedCardsRepositories;

import java.util.Set;

public class MostRedCardSerTest {
    private MostRedCardsRepositories repository;
    private MostRedCards mostRedCards;

    private MostRedCards getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostRedCardsRepositories.getRepository();
        this.mostRedCards = MostRedCardFactory.createMostRedCards(10);
    }

    @Test
    public void a_create() {
        MostRedCards created = this.repository.create(this.mostRedCards);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mostRedCards);
    }

    @Test
    public void c_update() {
        int mostRedCards = 9;
        MostRedCards updated = new MostRedCards.Builder().numOfRedCards(mostRedCards).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(mostRedCards, updated.getNumOfRedCards());
    }

    @Test
    public void e_delete() {
        MostRedCards saved = getSaved();
        this.repository.delete(saved.getNumOfRedCards());
        d_getAll();
    }

  /*  @Test
    public void b_read() {
        MostRedCards saved = getSaved();
        MostRedCards read = this.repository.read(saved.getNumOfRedCards());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<MostRedCards> MostRedCards = this.repository.getAll();
        System.out.println("In getall, all = " + MostRedCards);
    }

}
