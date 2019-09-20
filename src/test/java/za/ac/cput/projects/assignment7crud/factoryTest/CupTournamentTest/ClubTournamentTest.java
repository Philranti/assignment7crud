package za.ac.cput.projects.assignment7crud.factoryTest.CupTournamentTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.ClubTournamentFactory;


public class ClubTournamentTest  {
    private ClubTournaments club;

    @Before
    public void  setUp() throws Exception{
        club = ClubTournamentFactory.createClubTournament("UEFA CHAMPIONS LEAGUE", 32,"Barcelona" );
    }

    @Test
    public void createClubTournament(){
        Assert.assertNotNull(club.getClubTournamentName());
        Assert.assertNotNull(club);
        System.out.println(club.toString());
    }
}
