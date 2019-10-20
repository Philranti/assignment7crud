package za.ac.cput.projects.assignment7crud.factoryTest.ExhibitionTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerGame;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.ChooseTeamFactory;


public class ChooseTeamTest extends SoccerGame {
    private ChooseTeams teams;

    @Before
    public void setUp() {
       teams = ChooseTeamFactory.createTeams("Liverpool","Barcelona");

    }

    @Test
    public void createChooseTeams(){
        teams = ChooseTeamFactory.createTeams("Barcelona", "Real Madrid" );
        Assert.assertNotNull(teams.getChooseTeamA(), teams.getChooseTeamA());
        System.out.println(teams.toString());
    }
}
