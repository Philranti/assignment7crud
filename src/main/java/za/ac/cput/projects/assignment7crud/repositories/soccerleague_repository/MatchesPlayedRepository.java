package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.MatchePlayed;

import java.util.Set;

public interface MatchesPlayedRepository extends SoccerLeagueMainRepository<MatchePlayed, String> {
    Set<MatchePlayed> getAll();}
