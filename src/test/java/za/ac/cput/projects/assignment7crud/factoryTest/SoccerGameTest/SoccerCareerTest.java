package za.ac.cput.projects.assignment7crud.factoryTest.SoccerGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.CareerFactory;

public class SoccerCareerTest {
    private SoccerCareerLeague career;

    @Before
    public void setUp() {
        career = CareerFactory.createCareer("Coaching Career", "Barcelona" );
    }

    @Test
    public void createCareer(){

        Assert.assertEquals(career.getCareerType(), career.getCareerType());
        Assert.assertEquals(career.getTeamCareerChosen(), career.getTeamCareerChosen());
        System.out.println(career.toString());
    }
}
