package za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory;


import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;

public class GamePlayFactory {
    public static GamePlay createGamePlay(String playerMode, int minutesPlay, boolean extraTime, boolean penalties, int numOfSubs, String venueChosen) {
        return new GamePlay.Builder()
                .playerMode(playerMode)
                .minutesPlay(minutesPlay)
                .extraTime(extraTime)
                .penalties(penalties)
                .numOfSubs(numOfSubs)
                .venueChosen(venueChosen)
                .build();
    }
}
