package za.ac.cput.projects.assignment7crud.serviceTest.SoccerLeagueServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.MatchePlayed;
import za.ac.cput.projects.assignment7crud.factory.SoccerLeagueFactory.MatchesPlayedFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository.MatchesPlayedRepositories;

import java.util.Set;

public class MatchesPlayedSerTest {

    private MatchesPlayedRepositories repository;
    private MatchePlayed matchesPlayed;

    private MatchePlayed getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MatchesPlayedRepositories.getRepository();
        this.matchesPlayed = MatchesPlayedFactory.createMatchesPlayed(38,30,6,2);
    }

    @Test
    public void a_create() {
        MatchePlayed created = this.repository.create(this.matchesPlayed);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.matchesPlayed);
    }

    @Test
    public void c_update() {
        int renameMatcheWon = 33;
        MatchePlayed updated = new MatchePlayed.Builder().matchesWon(renameMatcheWon).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(renameMatcheWon, updated.getMatchesWon());
    }

    @Test
    public void e_delete() {
        MatchePlayed saved = getSaved();
        this.repository.delete(String.valueOf(saved.getMatchesWon()));
        d_getAll();
    }

    @Test
    public void b_read() {
        MatchePlayed saved = getSaved();
        MatchePlayed read = this.repository.read(saved.getMatchesWon());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<MatchePlayed> MatchePlayed = this.repository.getAll();
        System.out.println("In getall, all = " + MatchePlayed);
    }

}
