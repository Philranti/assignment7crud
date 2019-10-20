package za.ac.cput.projects.assignment7crud.services.ExhibitionServices;

import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.List;

public interface ChooseTeamInterfaceService extends MainService<ChooseTeams, String> {
    ChooseTeams retrieveByDesc(String choose);
    List<ChooseTeams> getAll();
}
