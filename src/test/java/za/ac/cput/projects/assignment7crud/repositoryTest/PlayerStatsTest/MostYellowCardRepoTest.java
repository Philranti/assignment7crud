package za.ac.cput.projects.assignment7crud.repositoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostYellowCards;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostYellowCardsFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest.MostYellowCardTest;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostYellowCardRepositories;
import za.ac.cput.projects.assignment7crud.repositories.playerstats_repository.MostYellowCardRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MostYellowCardRepoTest {
    MostYellowCards yellowCards;


    private MostYellowCardRepository repository;
    private MostYellowCardTest mostYellowCardsTest;


    private MostYellowCards getSavedMostYellowCards() {
        Set<MostYellowCards> savedMostYellowCardsTransfer = this.repository.getAll();
        return savedMostYellowCardsTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MostYellowCardRepositories.getRepository();
      //  this.yellowCards = mostYellowCardsTest.setUp();
    }

    @Test
    public void create() {
        MostYellowCards created = this.repository.create(this.yellowCards);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.yellowCards);
    }

   /* @Test
    public void read() {
        MostYellowCards savedMostYellowCards = getSavedMostYellowCards();

        MostYellowCards read = this.repository.read(String.valueOf(savedMostYellowCards.getNumOfYellowCards()));
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMostYellowCards, read);
    }*/

    private MostYellowCards getsavedMostYellowCardsTransfer() {
        Set<MostYellowCards> savedMostYellowCardsTransfer = this.repository.getAll();
        return savedMostYellowCardsTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        MostYellowCards savedMostYellowCards = getSavedMostYellowCards();
        this.repository.delete(String.valueOf(savedMostYellowCards.getNumOfYellowCards()));
        getAll();
    }*/

    @Test
    public void update() {
        int createMostYellowCards = 30;
        MostYellowCards MostYellowCards = new MostYellowCards.Builder().numOfYellowCards(createMostYellowCards).build();
        System.out.println("In update, about_to_updated = " +MostYellowCards);
        MostYellowCards updated = this.repository.update(MostYellowCards);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createMostYellowCards, updated.getNumOfYellowCards());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MostYellowCards> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
