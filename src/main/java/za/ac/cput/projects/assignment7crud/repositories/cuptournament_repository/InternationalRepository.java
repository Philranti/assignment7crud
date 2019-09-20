package za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository;

import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface InternationalRepository extends SoccerGameMainRepository<InternationalTournaments, String> {
    Set<InternationalTournaments> getAll();}
