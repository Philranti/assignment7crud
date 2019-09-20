package za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository;

import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;

import java.util.*;

@Repository
public class InternationalRepositories implements InternationalRepository {
    private static InternationalRepositories repository = null;
    private Map<String, InternationalTournaments> internationalTournamentsSet;


    private InternationalRepositories(){
        this.internationalTournamentsSet = new HashMap<>();
    }

    public static InternationalRepositories getRepository(){
        if (repository == null) repository = new InternationalRepositories();
        return repository;
    }


    public InternationalTournaments create(InternationalTournaments internationalTournaments){
        this.internationalTournamentsSet.put(internationalTournaments.getInterTournamentName(), internationalTournaments);
        return internationalTournaments;
    }

    
    public InternationalTournaments read(String s)
    {
        return this.internationalTournamentsSet.get(s);
    }

    

   

    public InternationalTournaments update(InternationalTournaments internationalTournaments){

        this.internationalTournamentsSet.replace(internationalTournaments.getInterTournamentName(), internationalTournaments);
        return this.internationalTournamentsSet.get(internationalTournaments.getInterTournamentName());
    }

    
    public void delete(String s) {

    }


    public Set<InternationalTournaments> getAll(){


        Collection<InternationalTournaments> internationalTournaments = this.internationalTournamentsSet.values();
        Set<InternationalTournaments> set = new HashSet<>();
        set.addAll(internationalTournaments);
        return set;
    }
}

