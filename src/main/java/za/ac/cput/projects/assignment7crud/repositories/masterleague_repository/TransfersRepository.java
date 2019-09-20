package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.Transfers;

import java.util.Set;

public interface TransfersRepository extends MasterLeagueMainRepository<Transfers, String> {
    Set<Transfers> getAll();}
