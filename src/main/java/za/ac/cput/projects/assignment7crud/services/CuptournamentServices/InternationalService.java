package za.ac.cput.projects.assignment7crud.services.CuptournamentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.InternationalRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class InternationalService implements InternationalTournamentServiceInterface{
    @Autowired
    private  InternationalService service = null;

    @Autowired
    private InternationalRepository repository;

    private InternationalService() {

    }

    public InternationalService getService(){

        if(service == null){
            return new InternationalService();
        }
        return service;
    }



    @Override
    public InternationalTournaments retrieveByDesc(String inter) {
        List<InternationalTournaments> InternationalTournamentsList = getAll();
        for(InternationalTournaments InternationalTournaments: InternationalTournamentsList)
        {
            if(InternationalTournaments.getInterTournamentName().equalsIgnoreCase(inter))
                return InternationalTournaments;
        }
        return null;
    }

    @Override
    public InternationalTournaments create(InternationalTournaments InternationalTournaments) {
        return this.repository.save(InternationalTournaments);
    }

    @Override
    public InternationalTournaments update(InternationalTournaments InternationalTournaments) {
        return this.repository.save(InternationalTournaments);
    }


    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public InternationalTournaments read(String s) {
        Optional<InternationalTournaments> InternationalTournaments = this.repository.findById(s);
        return InternationalTournaments.orElse(null);

    }


    @Override
    public List<InternationalTournaments> getAll() {
        return this.repository.findAll();
    }
}
