package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerCareerTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.CoachingCareer;
import za.ac.cput.projects.assignment7crud.factory.SoccerCareerFactory.CoachingCareerFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerCareerTest.CoachingCareerTest;
import za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository.CoachingCareerRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository.CoachingCareerRepository;

import java.util.Set;


public class CoachingCareerRepoTest {
    CoachingCareer career;

    private CoachingCareerRepository repository;
    private CoachingCareerTest coachingCareerTest;


    private CoachingCareer getSavedCoachingCareer() {
        Set<CoachingCareer> savedCoachingCareer = this.repository.getAll();
        return savedCoachingCareer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CoachingCareerRepositories.getRepository();
      //  this.career = coachingCareerTest.setUp();
    }

    @Test
    public void create() {
        CoachingCareer created = this.repository.create(this.career);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.career);
    }

    @Test
    public void read() {
        CoachingCareer savedCoachingCareer = getSavedCoachingCareer();

        CoachingCareer read = this.repository.read(savedCoachingCareer.getTeamCareerChosen());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCoachingCareer, read);
    }

    private CoachingCareer getsavedCoachingCareerTransfer() {
        Set<CoachingCareer> savedCoachingCareerTransfer = this.repository.getAll();
        return savedCoachingCareerTransfer.iterator().next();
    }

    @Test
    public void delete() {
        CoachingCareer savedCoachingCareer = getSavedCoachingCareer();
        this.repository.delete(savedCoachingCareer.getTeamCareerChosen());
        getAll();
    }

    @Test
    public void update() {
        int createCoachingCareer = 21;
        CoachingCareer CoachingCareer = new CoachingCareer.Builder().leagueTrophies(createCoachingCareer).build();
        System.out.println("In update, about_to_updated = " +CoachingCareer);
        CoachingCareer updated = this.repository.update(CoachingCareer);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createCoachingCareer, updated.getLeagueTrophies());
        getAll();
    }

    @Test
    public void getAll() {
        Set<CoachingCareer> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
