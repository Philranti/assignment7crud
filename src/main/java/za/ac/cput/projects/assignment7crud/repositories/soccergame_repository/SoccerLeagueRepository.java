package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerLeague;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface SoccerLeagueRepository extends SoccerGameMainRepository<SoccerLeague, String> {
    Set<SoccerLeague> getAll();
}
