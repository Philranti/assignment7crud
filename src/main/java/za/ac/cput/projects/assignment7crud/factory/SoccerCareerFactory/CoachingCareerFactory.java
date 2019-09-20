package za.ac.cput.projects.assignment7crud.factory.SoccerCareerFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.CoachingCareer;

public class CoachingCareerFactory {
    public static CoachingCareer createCoachingCareer(int yearsCoached, int leagueTrophies, int cupTrophies, int internationalTrophies) {
        return new CoachingCareer.Builder()
                .yearsCoached(yearsCoached)
                .leagueTrophies(leagueTrophies)
                .cupTrophies(cupTrophies)
                .internationalTrophies(internationalTrophies)
                .build();
    }
}
