package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.PromotePlayers;

import java.util.Set;

public interface PromotedPlayerRepository extends MasterLeagueMainRepository<PromotePlayers, String> {
    Set<PromotePlayers> getAll();}
