package za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.CoachingCareer;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface CoachingCareerRepository extends SoccerGameMainRepository<CoachingCareer, String> {
    Set<CoachingCareer> getAll();}
