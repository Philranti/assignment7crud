package za.ac.cput.projects.assignment7crud.services.CuptournamentServices;

import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.List;
import java.util.Set;

public interface InternationalTournamentServiceInterface extends MainService<InternationalTournaments, String> {
    InternationalTournaments retrieveByDesc(String international);
    List<InternationalTournaments> getAll();
}
