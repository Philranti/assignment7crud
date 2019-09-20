package za.ac.cput.projects.assignment7crud.services.CuptournamentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.ClubTournamentRepository;

import java.util.Set;

@Service
public class ClubTournamentService implements ClubTournamentServiceInterface {

    @Autowired
    private ClubTournamentRepository repository;

    @Override
    public ClubTournaments create(ClubTournaments create) {
        return repository.create(create);
    }


    @Override
    public ClubTournaments read(String read) {
        return repository.read(read);
    }

    @Override
    public ClubTournaments update(ClubTournaments update) {
        return repository.update(update);
    }

    @Override
    public void delete(String delete) {
        repository.delete(delete);

    }


    @Override
    public Set<ClubTournaments> getAll() {
        return repository.getAll();
    }
}


