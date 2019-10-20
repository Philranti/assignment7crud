package za.ac.cput.projects.assignment7crud.repositories.newgame_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

@Repository
public interface CreateNewGameRepository extends JpaRepository<NewGame, String> {

}
