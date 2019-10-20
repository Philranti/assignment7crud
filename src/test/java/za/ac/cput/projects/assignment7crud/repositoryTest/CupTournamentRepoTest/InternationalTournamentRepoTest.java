package za.ac.cput.projects.assignment7crud.repositoryTest.CupTournamentRepoTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.InternationalTournamentFactory;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.InternationalRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InternationalTournamentRepoTest {

    
    @Autowired
    private InternationalRepository repository;
    private InternationalTournaments international;


    private InternationalTournaments getSavedInternationalTournaments() {
        List<InternationalTournaments> savedClubs = this.repository.findAll();
        return savedClubs.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
       // this.repository = InternationalRepositories.getRepository();
        this.international =  InternationalTournamentFactory.internationalTournaments("AFCON ", 2 ,50,"Cameroon");
    }


    @Test
    public void a_create() {
        InternationalTournaments created = this.repository.save(this.international);
        System.out.println("In create, created = " + created);
        c_getAll();
        Assert.assertSame(created, this.international);
    }

    @Test
    public void b_read() {
        InternationalTournaments savedInternationalTournaments = getSavedInternationalTournaments();
        System.out.println("In read,  tournamentId = "+ savedInternationalTournaments.getInterTournamentName());
        Optional<InternationalTournaments> readId = this.repository.findById(savedInternationalTournaments.getInterTournamentName());
        System.out.println("In read, read = " + savedInternationalTournaments.toString());
        c_getAll();
        Assert.assertNotNull(savedInternationalTournaments);
    }



    @Test
    public void e_delete() {
        InternationalTournaments savedInternational = getSavedInternationalTournaments();
        this.repository.deleteById(savedInternational.getInterTournamentName());
        c_getAll();
    }

    @Test
    public void d_update() {
        String internationalName = "EUROS";
        InternationalTournaments updatedInternationals = new InternationalTournaments.Builder().copy(getSavedInternationalTournaments()).interTournamentName(internationalName).build();
        System.out.println("In update, about_to_updated = " +updatedInternationals);
        InternationalTournaments updated = this.repository.save(updatedInternationals);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(internationalName, updated.getInterTournamentName());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        List<InternationalTournaments> all = this.repository.findAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
