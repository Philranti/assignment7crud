package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;



import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostRedCards;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface MostRedCardsRepository extends SoccerGameMainRepository<MostRedCards, String> {
    Set<MostRedCards> getAll();}
