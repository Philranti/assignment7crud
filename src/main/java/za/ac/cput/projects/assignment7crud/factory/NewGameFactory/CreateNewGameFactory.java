package za.ac.cput.projects.assignment7crud.factory.NewGameFactory;


import za.ac.cput.projects.assignment7crud.util.Misc;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;

public class CreateNewGameFactory {
    private static final String SUFFIX = Misc.getSuffixFromClassName(CreateNewGameFactory.class);
    public static NewGame newGame(String id, String createName, String deleteGameName) {
        id = SUFFIX;
        return new NewGame.Builder()
                .gameId(id)
                .createName(createName)
                .savedGameName(deleteGameName)
                .build();
    }

}
