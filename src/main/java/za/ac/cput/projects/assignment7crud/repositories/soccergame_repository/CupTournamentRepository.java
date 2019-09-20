package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;


import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public  interface CupTournamentRepository extends SoccerGameMainRepository<CupTournaments, String> {
    Set<CupTournaments> getAll();


}
