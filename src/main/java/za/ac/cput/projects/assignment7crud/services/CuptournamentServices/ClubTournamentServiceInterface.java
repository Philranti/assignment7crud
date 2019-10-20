package za.ac.cput.projects.assignment7crud.services.CuptournamentServices;


import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.List;
import java.util.Set;

public interface ClubTournamentServiceInterface extends MainService<ClubTournaments, String> {
    ClubTournaments retrieveByDesc(String club);
    List<ClubTournaments> getAll();

}
