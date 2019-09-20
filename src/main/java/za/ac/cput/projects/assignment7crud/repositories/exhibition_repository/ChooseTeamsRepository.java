package za.ac.cput.projects.assignment7crud.repositories.exhibition_repository;



import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;

import java.util.Set;

public interface ChooseTeamsRepository extends ExhibitionMainRepository<ChooseTeams, String> {
    Set<ChooseTeams> getAll();
}
