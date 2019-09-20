package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface SoccerCareerRepository extends SoccerGameMainRepository<SoccerCareerLeague, String> {
    Set<SoccerCareerLeague> getAll();

}
