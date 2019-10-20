package za.ac.cput.projects.assignment7crud.services.CuptournamentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository.ClubTournamentRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ClubTournamentService implements ClubTournamentServiceInterface {

    @Autowired
    private  ClubTournamentService service = null;

    @Autowired
    private ClubTournamentRepository repository;

    private ClubTournamentService() {

    }

    public ClubTournamentService getService(){

        if(service == null){
            return new ClubTournamentService();
        }
        return service;
    }



    @Override
    public ClubTournaments retrieveByDesc(String club) {
        List<ClubTournaments> clubTournamentsList = getAll();
        for(ClubTournaments clubTournaments: clubTournamentsList)
        {
            if(clubTournaments.getClubTournamentName().equalsIgnoreCase(club))
                return clubTournaments;
        }
        return null;
    }

    @Override
    public ClubTournaments create(ClubTournaments clubTournaments) {
        return this.repository.save(clubTournaments);
    }

    @Override
    public ClubTournaments update(ClubTournaments club) {
        return this.repository.save(club);
    }


    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public ClubTournaments read(String s) {
        Optional<ClubTournaments> clubTournaments = this.repository.findById(s);
        return clubTournaments.orElse(null);

    }


    @Override
    public List<ClubTournaments> getAll() {
        return this.repository.findAll();
    }}


