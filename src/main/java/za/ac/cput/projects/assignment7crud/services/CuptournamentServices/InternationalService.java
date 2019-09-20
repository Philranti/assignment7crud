package za.ac.cput.projects.assignment7crud.services.CuptournamentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.InternationalRepository;

import java.util.Set;

@Service
public class InternationalService implements InternationalTournamentServiceInterface{

    @Autowired
    private InternationalRepository repository;

    @Override
    public InternationalTournaments create(InternationalTournaments create) {
        return repository.create(create);
    }


    @Override
    public InternationalTournaments read(String read) {
        return repository.read(read);
    }

    @Override
    public InternationalTournaments update(InternationalTournaments update) {
        return repository.update(update);
    }

    @Override
    public void delete(String delete) {
        repository.delete(delete);

    }


    @Override
    public Set<InternationalTournaments> getAll() {
        return repository.getAll();
    }
}
