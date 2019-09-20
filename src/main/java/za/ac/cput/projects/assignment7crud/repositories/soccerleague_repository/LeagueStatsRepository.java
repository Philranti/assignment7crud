package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.LeagueStats;

import java.util.Set;

public interface LeagueStatsRepository extends SoccerLeagueMainRepository<LeagueStats, String> {
    Set<LeagueStats> getAll();}
