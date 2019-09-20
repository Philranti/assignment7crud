package za.ac.cput.projects.assignment7crud.factory.NewGameFactory;


import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;

public class CreateNewGameFactory {
    public static NewGame newGame(String createName, String deleteGameName) {
        return new NewGame.Builder()
                .createName(createName)
                .deleteGameName(deleteGameName)
                .build();
    }

}
