package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.Divisions;

import java.util.Set;

public interface DivisionsRepository extends SoccerLeagueMainRepository<Divisions, String> {
    Set<Divisions> getAll();}
