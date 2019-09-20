package za.ac.cput.projects.assignment7crud.factoryTest.SoccerCareerTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.CoachingCareer;
import za.ac.cput.projects.assignment7crud.factory.SoccerCareerFactory.CoachingCareerFactory;


public class CoachingCareerTest {
    CoachingCareer career;

    @Before
    public void setUp(){
        career = CoachingCareerFactory.createCoachingCareer(20, 8,5, 2);
    }

    @Test
    public void createCoachingCareer(){

        Assert.assertEquals(career.getYearsCoached(), career.getYearsCoached());
        Assert.assertEquals(career.getLeagueTrophies(), career.getLeagueTrophies());
        Assert.assertEquals(career.getCupTrophies(), career.getCupTrophies());
        Assert.assertEquals(career.getInternationalTrophies(), career.getInternationalTrophies());
        System.out.println(career.toString());
    }
}
