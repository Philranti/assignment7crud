package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;



import za.ac.cput.projects.assignment7crud.domains.PlayerStats.PlayerStats;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface PlayerStatsRepository extends SoccerGameMainRepository<PlayerStats, String> {
    Set<PlayerStats> getAll();}
