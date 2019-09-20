package za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory;


import za.ac.cput.projects.assignment7crud.domains.SoccerGame.ExhibitionMatch;

public class ExhibitionFactory {
    public static ExhibitionMatch createExhibition(String scoreResult, String playerWon, boolean homeGame) {
        return new ExhibitionMatch.Builder()
                .scoreResult(scoreResult)
                .playerWon(playerWon)
                .homeGame(homeGame)
                .build();
    }
}
