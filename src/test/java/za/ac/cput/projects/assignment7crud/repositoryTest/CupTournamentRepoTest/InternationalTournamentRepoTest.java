package za.ac.cput.projects.assignment7crud.repositoryTest.CupTournamentRepoTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.InternationalTournamentFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.CupTournamentTest.InternationalTournamentTest;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.InternationalRepositories;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.InternationalRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InternationalTournamentRepoTest {

    
    @Autowired
    private InternationalRepository repository;
    private InternationalTournaments international;


    private InternationalTournaments getSavedInternationalTournaments() {
        Set<InternationalTournaments> savedClubs = this.repository.getAll();
        return savedClubs.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = InternationalRepositories.getRepository();
        this.international =  InternationalTournamentFactory.internationalTournaments("AFCON ", 2 ,50,"Cameroon");
    }


    @Test
    public void a_create() {
        InternationalTournaments created = this.repository.create(this.international);
        System.out.println("In create, created = " + created);
        c_getAll();
        Assert.assertSame(created, this.international);
    }

    @Test
    public void b_read() {
        InternationalTournaments savedInternationalTournaments = getSavedInternationalTournaments();
        System.out.println("In read,  tournamentId = "+ savedInternationalTournaments.getInterTournamentName());
        InternationalTournaments readId = this.repository.read(savedInternationalTournaments.getInterTournamentName());
        System.out.println("In read, read = " + savedInternationalTournaments.toString());
        c_getAll();
        Assert.assertNotNull(savedInternationalTournaments);
    }



    @Test
    public void e_delete() {
        InternationalTournaments savedInternational = getSavedInternationalTournaments();
        this.repository.delete(savedInternational.getInterTournamentName());
        c_getAll();
    }

    @Test
    public void d_update() {
        String internationalName = "EUROS";
        InternationalTournaments updatedInternationals = new InternationalTournaments.Builder().copy(getSavedInternationalTournaments()).interTournamentName(internationalName).build();
        System.out.println("In update, about_to_updated = " +updatedInternationals);
        InternationalTournaments updated = this.repository.create(updatedInternationals);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(internationalName, updated.getInterTournamentName());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        Set<InternationalTournaments> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
