package za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.PlayerCareer;

import java.util.Set;

public interface PlayerCareerRepository extends SoccerCareerMainRepository<PlayerCareer, String> {
    Set<PlayerCareer> getAll();
}
