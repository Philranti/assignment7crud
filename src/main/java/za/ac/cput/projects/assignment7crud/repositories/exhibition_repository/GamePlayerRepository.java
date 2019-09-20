package za.ac.cput.projects.assignment7crud.repositories.exhibition_repository;

import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;

import java.util.Set;

public interface GamePlayerRepository extends ExhibitionMainRepository<GamePlay, String> {
    Set<GamePlay> getAll();
}
