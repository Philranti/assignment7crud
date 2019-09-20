package za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;

public class CareerFactory {
    public static SoccerCareerLeague createCareer(String careerType, String teamCareerChosen) {
        return new SoccerCareerLeague.Builder()
                .careerType(careerType)
                .teamCareerChosen(teamCareerChosen)
                .build();
    }

}
