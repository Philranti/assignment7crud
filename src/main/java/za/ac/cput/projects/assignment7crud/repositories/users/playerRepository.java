package za.ac.cput.projects.assignment7crud.repositories.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.List;
import java.util.Set;

@Repository
public interface playerRepository  extends JpaRepository<Player, String> {


}

