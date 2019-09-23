package za.ac.cput.projects.assignment7crud.services.users;

import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

public interface playerService extends SoccerGameMainRepository<Player, String> {
}
