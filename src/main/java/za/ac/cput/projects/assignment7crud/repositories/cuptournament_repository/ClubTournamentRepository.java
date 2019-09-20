package za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository;



import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface ClubTournamentRepository extends SoccerGameMainRepository<ClubTournaments, String> {
    Set<ClubTournaments> getAll();


}
