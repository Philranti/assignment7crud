package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.MatchePlayed;

import java.util.HashSet;
import java.util.Set;

public class MatchesPlayedRepositories implements MatchesPlayedRepository{
    private static MatchesPlayedRepositories repository = null;
    private Set<MatchePlayed> matches;


    private MatchesPlayedRepositories(){
        this.matches = new HashSet<>();
    }

    public static MatchesPlayedRepositories getRepository(){
        if (repository == null) repository = new MatchesPlayedRepositories();
        return repository;
    }

    public MatchePlayed create(MatchePlayed matches){
        this.matches.add(matches);
        return matches;
    }

    public MatchePlayed read(int matches){

        return null;
    }

    public void delete(String matchesId) {

        this.matches.remove(matchesId);
    }

    public MatchePlayed update(MatchePlayed matches){

        return matches;
    }


    public Set<MatchePlayed> getAll(){
        return this.matches;
    }
}
