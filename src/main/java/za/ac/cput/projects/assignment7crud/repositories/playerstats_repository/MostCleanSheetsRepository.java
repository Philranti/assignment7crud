package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;



import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostCleanSheets;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface MostCleanSheetsRepository extends SoccerGameMainRepository<MostCleanSheets, String> {
    Set<MostCleanSheets> getAll();}
