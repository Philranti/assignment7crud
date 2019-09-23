package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerLeagueTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.MatchePlayed;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.MatchesPlayedFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerLeagueTest.MatchesPlayedTest;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.MatchesPlayedRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.MatchesPlayedRepository;

import java.util.Set;

public class MatchesPlayedRepoTest {
    MatchePlayed matches;

    private MatchesPlayedRepository repository;
    private MatchesPlayedTest matchesPlayedTest;


    private MatchePlayed getSavedMatchesPlayed() {
        Set<MatchePlayed> savedMatchesPlayed = this.repository.getAll();
        return savedMatchesPlayed.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MatchesPlayedRepositories.getRepository();
        //this.matches = matchesPlayedTest.setUp();
    }

    @Test
    public void create() {
        MatchePlayed created = this.repository.create(this.matches);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.matches);
    }

   /* @Test
    public void read() {
        MatchePlayed savedMatchesPlayed = getSavedMatchesPlayed();

        MatchePlayed read = this.repository.read(savedMatchesPlayed.getMatchesWon());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMatchesPlayed, read);
    }*/

    private MatchePlayed getsavedMatchePlayedTransfer() {
        Set<MatchePlayed> savedMatchePlayedTransfer = this.repository.getAll();
        return savedMatchePlayedTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        MatchePlayed savedMatchesPlayed = getSavedMatchesPlayed();
        this.repository.delete(String.valueOf(savedMatchesPlayed.getMatchesWon()));
        getAll();
    }*/

    @Test
    public void update() {
        int createMatchesWon = 25;
        MatchePlayed MatchePlayed = new MatchePlayed.Builder().matchesWon(createMatchesWon).build();
        System.out.println("In update, about_to_updated = " +MatchePlayed);
        MatchePlayed updated = this.repository.update(MatchePlayed);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createMatchesWon, updated.getMatchesWon());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MatchePlayed> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
