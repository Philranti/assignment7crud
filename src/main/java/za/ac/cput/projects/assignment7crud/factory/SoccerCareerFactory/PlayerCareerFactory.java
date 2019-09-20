package za.ac.cput.projects.assignment7crud.factory.SoccerCareerFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.PlayerCareer;

public class PlayerCareerFactory {
    public static PlayerCareer createPlayerCareer(String teamCareer, int yearsPlayed, int matchesPlayed, int goals, int assist) {
        return new PlayerCareer.Builder()
                .teamCareer(teamCareer)
                .yearsPlayed(yearsPlayed)
                .matchesPlayed(matchesPlayed)
                .goals(goals)
                .assist(assist)
                .build();
    }
}
