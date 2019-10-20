package za.ac.cput.projects.assignment7crud.services.users;

import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.List;
import java.util.Set;

public interface playerService extends MainService<Player, String> {
    Player retrieveByDesc(String play);
    List<Player> getAll();
}
