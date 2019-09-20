package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;



import za.ac.cput.projects.assignment7crud.domains.PlayerStats.TopGoalScorers;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface TopScorerRepository extends SoccerGameMainRepository<TopGoalScorers, String> {
    Set<TopGoalScorers> getAll();}
