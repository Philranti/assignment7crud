package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.TransferListed;

import java.util.Set;

public interface TransferListedRepository extends MasterLeagueMainRepository<TransferListed, String> {
    Set<TransferListed> getAll();}
