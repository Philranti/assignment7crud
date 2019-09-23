package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerCareerTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.PlayerCareer;
import za.ac.cput.projects.assignment7crud.factory.SoccerCareerFactory.PlayerCareerFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerCareerTest.PlayerCareerTest;
import za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository.PlayerCareerRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository.PlayerCareerRepository;

import java.util.Set;

public class PlayerCareerRepoTest {
    PlayerCareer playerCareer;

    private PlayerCareerRepository repository;
    private PlayerCareerTest playerCareerTest;


    private PlayerCareer getSavedPlayerCareer() {
        Set<PlayerCareer> savedPlayerCareer = this.repository.getAll();
        return savedPlayerCareer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PlayerCareerRepositories.getRepository();
     //   this.playerCareer = playerCareerTest.setUp();
    }

    @Test
    public void create() {
        PlayerCareer created = this.repository.create(this.playerCareer);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.playerCareer);
    }

 /*   @Test
    public void read() {
        PlayerCareer savedPlayerCareer = getSavedPlayerCareer();

        PlayerCareer read = this.repository.read(savedPlayerCareer.getYearsPlayed());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedPlayerCareer, read);
    }*/

    private PlayerCareer getsavedPlayerCareerTransfer() {
        Set<PlayerCareer> savedPlayerCareerTransfer = this.repository.getAll();
        return savedPlayerCareerTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        PlayerCareer savedPlayerCareer = getSavedPlayerCareer();
        this.repository.delete(savedPlayerCareer.getYearsPlayed());
        getAll();
    }*/

    @Test
    public void update() {
        int createPlayerCareer = 22;
        PlayerCareer PlayerCareer = new PlayerCareer.Builder().yearsPlayed(createPlayerCareer).build();
        System.out.println("In update, about_to_updated = " +PlayerCareer);
        PlayerCareer updated = this.repository.update(PlayerCareer);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createPlayerCareer, updated.getYearsPlayed());
        getAll();
    }

    @Test
    public void getAll() {
        Set<PlayerCareer> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
