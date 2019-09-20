package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.NewTransfers;

import java.util.Set;

public interface NewTransferRepository extends MasterLeagueMainRepository<NewTransfers, String> {
    Set<NewTransfers> getAll();}
