package za.ac.cput.projects.assignment7crud.repositories.users;

import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface playerRepository  extends SoccerGameMainRepository<Player, String> {


    Set<Player> getAll();
}

