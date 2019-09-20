package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.FreeAgents;

import java.util.Set;

public interface FreeAgentRepository extends MasterLeagueMainRepository<FreeAgents, String> {
    Set<FreeAgents> getAll();
}

