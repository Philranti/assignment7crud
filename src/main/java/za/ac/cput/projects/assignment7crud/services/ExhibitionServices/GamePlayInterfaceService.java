package za.ac.cput.projects.assignment7crud.services.ExhibitionServices;

import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.List;

public interface GamePlayInterfaceService extends MainService<GamePlay, String> {
    GamePlay retrieveByDesc(String choose);
    List<GamePlay> getAll();
}
