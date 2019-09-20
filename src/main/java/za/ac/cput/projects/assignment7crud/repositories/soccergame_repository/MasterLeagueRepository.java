package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerGame.MasterLeague;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface MasterLeagueRepository extends SoccerGameMainRepository<MasterLeague, String> {
    Set<MasterLeague> getAll();


}
