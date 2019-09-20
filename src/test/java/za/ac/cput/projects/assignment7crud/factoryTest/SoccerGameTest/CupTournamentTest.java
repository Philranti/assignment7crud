package za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.CupTournamentFactory;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.CupTournamentsFactory;


public class CupTournamentTest {
    private CupTournaments tournaments;

    @Before
    public void setUp() {
        tournaments = CupTournamentsFactory.createCupTournament("World Cup", 1, 32, "France");
    }

    @Test
    public void createCupTournament(){

        Assert.assertEquals(tournaments.getNameOfTournament(), tournaments.getNameOfTournament());
        Assert.assertEquals(tournaments.getNumberOfTournaments(), tournaments.getNumberOfTournaments());
        Assert.assertEquals(tournaments.getNumberOfCupTeams(), tournaments.getNumberOfCupTeams());
        System.out.println(tournaments);
    }
}
