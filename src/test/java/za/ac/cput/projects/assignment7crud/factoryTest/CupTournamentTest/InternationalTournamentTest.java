package za.ac.cput.projects.assignment7crud.factoryTest.CupTournamentTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.InternationalTournamentFactory;

public class InternationalTournamentTest {
    private InternationalTournaments international;

    @Before
    public void setUp(){
         international = InternationalTournamentFactory.internationalTournaments("AFCON ", 2 ,50,"Cameroon");
    }

    @Test
    public void createInternational(){

        Assert.assertNotNull(international.getInterTournamentName(), international.getInterTournamentName());
        System.out.println(international.toString());
    }
}
