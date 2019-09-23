package za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository;




import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;

import java.util.*;
//import java.util.function.Predicate;

@Repository
public class ClubTournamentRepositories implements ClubTournamentRepository{
    private static ClubTournamentRepositories repository = null;
    private Map<String, ClubTournaments> clubTournaments;


    private ClubTournamentRepositories(){
        this.clubTournaments = new HashMap<>();
    }

    public static ClubTournamentRepositories getRepository(){
        if (repository == null) repository = new ClubTournamentRepositories();
        return repository;
    }

    @Override
    public ClubTournaments create(ClubTournaments ClubTournaments){
        this.clubTournaments.put(ClubTournaments.getClubTournamentName(), ClubTournaments);
        return ClubTournaments;
    }

    @Override
    public ClubTournaments read(String clubTournamentId)
    {

        return this.clubTournaments.get(clubTournamentId);

    }

    @Override
    public ClubTournaments update(ClubTournaments ClubTournaments){
                this.clubTournaments.replace(ClubTournaments.getClubTournamentName(), ClubTournaments);
                return this.clubTournaments.get(ClubTournaments.getClubTournamentName());
    }

    @Override
    public void delete(String s) {
        this.clubTournaments.remove(s);
    }

    @Override
    public Set<ClubTournaments> getAll(){

        Collection<ClubTournaments> clubTournaments = this.clubTournaments.values();
        Set<ClubTournaments> set = new HashSet<>();
        set.addAll(clubTournaments);
        return set;
    }
}
    


