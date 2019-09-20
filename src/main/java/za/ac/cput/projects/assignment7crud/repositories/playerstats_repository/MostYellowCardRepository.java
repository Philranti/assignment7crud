package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;


import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostYellowCards;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface MostYellowCardRepository extends SoccerGameMainRepository<MostYellowCards, String> {
    Set<MostYellowCards> getAll();}
