package za.ac.cput.projects.assignment7crud.repositoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.CupTournamentFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest.CupTournamentTest;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.CupTournamentRepositories;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.CupTournamentRepository;

import java.util.Set;


public class CupTournamentRepoTest {
    private CupTournaments tournaments;
    
    private CupTournamentRepository repository;
    private CupTournamentTest cupTournamentsTest;


    private CupTournaments getSavedCupTournaments() {
        Set<CupTournaments> savedCupTournaments = this.repository.getAll();
        return savedCupTournaments.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CupTournamentRepositories.getRepository();
       // this.tournaments = cupTournamentsTest.setUp();
    }

    @Test
    public void create() {
        CupTournaments created = this.repository.create(this.tournaments);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.tournaments);
    }

    @Test
    public void read() {
        CupTournaments savedCupTournaments = getSavedCupTournaments();

        CupTournaments read = this.repository.read(savedCupTournaments.getNameOfTournament());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCupTournaments, read);
    }

    private CupTournaments getsavedCupTournamentsTransfer() {
        Set<CupTournaments> savedCupTournamentsTransfer = this.repository.getAll();
        return savedCupTournamentsTransfer.iterator().next();
    }

    @Test
    public void delete() {
        CupTournaments savedCupTournaments = getSavedCupTournaments();
        this.repository.delete(savedCupTournaments.getNameOfTournament());
        getAll();
    }

    @Test
    public void update() {
        String createCupTournaments = "FIFA Confederations Cup";
        CupTournaments CupTournaments = new CupTournaments.Builder().nameOfTournament(createCupTournaments).build();
        System.out.println("In update, about_to_updated = " +CupTournaments);
        CupTournaments updated = this.repository.update(CupTournaments);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createCupTournaments, updated.getNameOfTournament());
        getAll();
    }

    @Test
    public void getAll() {
        Set<CupTournaments> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
