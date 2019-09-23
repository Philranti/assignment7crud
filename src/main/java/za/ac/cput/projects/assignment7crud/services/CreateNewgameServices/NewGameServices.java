package za.ac.cput.projects.assignment7crud.services.CreateNewgameServices;

import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.Set;

public interface NewGameServices extends MainService <NewGame, String> {

    NewGame retrieveByDesc(String newDesc);

    Set<NewGame> getAll();
}
