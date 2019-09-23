package za.ac.cput.projects.assignment7crud.repositoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostRedCards;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostRedCardFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest.MostRedCardsTest;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostRedCardsRepositories;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostRedCardsRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MostRedCardsRepoTest {
    MostRedCards reds;

    private MostRedCardsRepository repository;
    private MostRedCardsTest mostRedCardsTest;


    private MostRedCards getSavedMostRedCards() {
        Set<MostRedCards> savedMostRedCardsTransfer = this.repository.getAll();
        return savedMostRedCardsTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostRedCardsRepositories.getRepository();
       // this.reds = mostRedCardsTest.setUp();
    }

    @Test
    public void create() {
        MostRedCards created = this.repository.create(this.reds);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.reds);
    }

/*    @Test
    public void read() {
        MostRedCards savedMostRedCards = getSavedMostRedCards();

        MostRedCards read = this.repository.read(String.valueOf(savedMostRedCards.getNumOfRedCards()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMostRedCards, read);
    }*/

    private MostRedCards getsavedMostRedCardsTransfer() {
        Set<MostRedCards> savedMostRedCardsTransfer = this.repository.getAll();
        return savedMostRedCardsTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        MostRedCards savedMostRedCards = getSavedMostRedCards();
        this.repository.delete(String.valueOf(savedMostRedCards.getNumOfRedCards()));
        getAll();
    } */

    @Test
    public void update() {
        int mostRedCards = 12;
        MostRedCards MostRedCards = new MostRedCards.Builder().numOfRedCards(mostRedCards).build();
        System.out.println("In update, about_to_updated = " +MostRedCards);
        MostRedCards updated = this.repository.update(MostRedCards);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(mostRedCards, updated.getNumOfRedCards());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MostRedCards> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
