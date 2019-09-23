package za.ac.cput.projects.assignment7crud.serviceTest.CupTournamentServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.ClubTournamentFactory;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.ClubTournamentRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClubTournamentSerTest {
    @Autowired
    private ClubTournamentRepositories repository;
    private ClubTournaments clubTournament;

    private ClubTournaments getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ClubTournamentRepositories.getRepository();
        this.clubTournament = ClubTournamentFactory.createClubTournament("UEFA Champions League",
                32, "Barcelona");
    }

    @Test
    public void a_create() {
        ClubTournaments created = this.repository.create(this.clubTournament);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.clubTournament);
    }

    @Test
    public void c_update() {
        String newClubTournamentName = "UERO League";
        ClubTournaments updated = new ClubTournaments.Builder().clubTournament(newClubTournamentName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newClubTournamentName, updated.getClubTournamentName());
    }

    @Test
    public void e_delete() {
        ClubTournaments saved = getSaved();
        this.repository.delete(saved.getClubTournamentName());
        d_getAll();
    }

    @Test
    public void b_read() {
        ClubTournaments saved = getSaved();
        ClubTournaments read = this.repository.read(saved.getClubTournamentName());
        System.out.println("In read, read = " + read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<ClubTournaments> ClubTournaments = this.repository.getAll();
        System.out.println("In getall, all = " + ClubTournaments);
    }
}