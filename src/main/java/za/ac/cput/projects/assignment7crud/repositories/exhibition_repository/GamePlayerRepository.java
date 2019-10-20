package za.ac.cput.projects.assignment7crud.repositories.exhibition_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;

import java.util.Set;

@Repository
public interface GamePlayerRepository extends JpaRepository<GamePlay, String> {

}
