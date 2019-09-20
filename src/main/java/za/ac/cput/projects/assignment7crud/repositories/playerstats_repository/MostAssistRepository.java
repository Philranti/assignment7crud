package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;



import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostAssists;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface MostAssistRepository extends SoccerGameMainRepository<MostAssists, String> {
    Set<MostAssists> getAll();}
