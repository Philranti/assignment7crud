package za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory;

import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerGame;

public class SoccerGameFactory {
    public static SoccerGame createSoccerGame(int gameId, String gameType, String gameDifficulty, int gameLength){
        return new SoccerGame.Builder()
                .gameId(gameId)
                .gameType(gameType)
                .gameDifficulty(gameDifficulty)
                .gameLength(gameLength)
                .build();
    }
}
