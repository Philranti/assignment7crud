package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerGame.ExhibitionMatch;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface ExhibitionRepository extends SoccerGameMainRepository<ExhibitionMatch, String> {
    Set<ExhibitionMatch> getAll();

}
