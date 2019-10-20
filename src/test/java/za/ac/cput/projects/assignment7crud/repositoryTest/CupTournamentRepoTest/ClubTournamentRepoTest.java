/*package za.ac.cput.projects.assignment7crud.repositoryTest.CupTournamentRepoTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
//import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.ClubTournamentFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.CupTournamentTest.ClubTournamentTest;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.ClubTournamentDB;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.ClubTournamentRepositories;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.ClubTournamentRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClubTournamentRepoTest {

    @Autowired
    private ClubTournaments club;
    private ClubTournamentRepository repository;

    private ClubTournaments getSavedClubTournaments() {
        Set<ClubTournaments> savedClubs = this.repository.getAll();
        return savedClubs.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ClubTournamentRepositories.getRepository();
        this.club = ClubTournamentFactory.createClubTournament("UEFA CHAMPIONS LEAGUE", 32,"Barcelona" );
    }

    @Test
    public void a_create() {
       ClubTournaments createdTournaments = this.repository.create(this.club);
        System.out.println("In create, created = " + createdTournaments);
        c_getAll();
        Assert.assertSame(createdTournaments, this.club);
    }

    @Test
    public void b_read() {
        ClubTournaments savedClubTournaments = getSavedClubTournaments();
        System.out.println("In read, club tournamentId = "+ savedClubTournaments.getClubTournamentName());
        ClubTournaments read = this.repository.read(savedClubTournaments.getClubTournamentName());
        System.out.println("In read, read = " + read);
        c_getAll();
        Assert.assertEquals(savedClubTournaments, read);
    }


    @Test
    public void e_delete() {
       ClubTournaments savedClub = getSavedClubTournaments();
         this.repository.delete(savedClub.getClubTournamentName());
      System.out.println("In delete, deleted = " +  savedClub.getClubTournamentName());
        c_getAll();
        Assert.assertEquals(savedClub.getClubTournamentName(), this.club.getClubTournamentName());

    }


    @Test
    public void d_update() {
        String clubName = "CAF Champions League";
        ClubTournaments course = new ClubTournaments.Builder().copy(getSavedClubTournaments()).clubTournament(clubName).build();
        System.out.println("In update, about_to_update = " + course);
        ClubTournaments updated = this.repository.create(course);
        System.out.println("In update, updated = " + updated);
        c_getAll();
        Assert.assertEquals(clubName, updated.getClubTournamentName());

    }

    @Test
    public void c_getAll() {
        Set<ClubTournaments> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);

    }
    

}
*/