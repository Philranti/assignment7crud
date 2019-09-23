package za.ac.cput.projects.assignment7crud.serviceTest.SoccerGameServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.CupTournamentFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.CupTournamentRepositories;

import java.util.Set;

public class CupTournamentSerTest {

    private CupTournamentRepositories repository;
    private CupTournaments cupTournaments;

    private CupTournaments getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CupTournamentRepositories.getRepository();
        this.cupTournaments = CupTournamentFactory.createCupTournament("World Cup", 1, 32, "France");
    }

    @Test
    public void a_create() {
        CupTournaments created = this.repository.create(this.cupTournaments);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.cupTournaments);
    }

    @Test
    public void c_update() {
        String cupTournamentWinner = "Brazil";
        CupTournaments updated = new CupTournaments.Builder().winner(cupTournamentWinner).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(cupTournamentWinner, updated.getWinner());
    }

   /* @Test
    public void e_delete() {
        CupTournaments saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getWinner()));
        d_getAll();
    }*/

   /* @Test
    public void b_read() {
        CupTournaments saved = getSaved();
        CupTournaments read = this.repository.read(Integer.parseInt(saved.getWinner()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<CupTournaments> CupTournaments = this.repository.getAll();
        System.out.println("In getall, all = " + CupTournaments);
    }

}
