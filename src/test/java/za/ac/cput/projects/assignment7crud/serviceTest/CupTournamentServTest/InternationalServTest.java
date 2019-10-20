package za.ac.cput.projects.assignment7crud.serviceTest.CupTournamentServTest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.InternationalTournamentFactory;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.InternationalRepository;

import java.util.List;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InternationalServTest {

    private InternationalRepository repository;
    private InternationalTournaments international;

    private InternationalTournaments getSaved(){
        return this.repository.findAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
       // this.repository = InternationalRepositories.getRepository();
    this.international = InternationalTournamentFactory.internationalTournaments("FIFA World Cup",
            1, 32, "France");
    }

    @Test
    public void a_create() {
        InternationalTournaments created = this.repository.save(this.international);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.international);
    }

    @Test
    public void c_update() {
            String newinternationalTournament = "FIFA Confederations Cup";
        InternationalTournaments updated = new InternationalTournaments.Builder().interTournamentName(newinternationalTournament).build();
        System.out.println("In update, updated = " + updated);
        this.repository.save(updated);
        Assert.assertSame(newinternationalTournament, updated.getInterTournamentName());
    }

    @Test
    public void e_delete() {
        InternationalTournaments saved = getSaved();
        this.repository.deleteById(saved.getInterTournamentName());
        d_getAll();
    }

    @Test
    public void b_read() {
        InternationalTournaments saved = getSaved();
       // InternationalTournaments read = this.repository.findById(saved.getInterTournamentName());
       // System.out.println("In read, read = "+ read);
       // Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        List<InternationalTournaments> InternationalTournaments = this.repository.findAll();
        System.out.println("In getall, all = " + InternationalTournaments);
    }
}
