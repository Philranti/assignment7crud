package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerLeague;

import java.util.HashSet;
import java.util.Set;

public class SoccerLeagueRepositories implements SoccerLeagueRepository {
    private static SoccerLeagueRepositories repository = null;
    private Set<SoccerLeague> soccerLeagues;


    private SoccerLeagueRepositories(){
        this.soccerLeagues = new HashSet<>();
    }

    public static SoccerLeagueRepositories getRepository(){
        if (repository == null) repository = new SoccerLeagueRepositories();
        return repository;
    }


    public SoccerLeague create(SoccerLeague soccerLeagues){
        this.soccerLeagues.add(soccerLeagues);
        return soccerLeagues;
    }

    @Override
    public SoccerLeague read(String s) {
        return null;
    }

    public SoccerLeague read(int soccerLeague){

        return null;
    }

    public void delete(int soccerLeagueId) {

    }

    public SoccerLeague update(SoccerLeague soccerLeague){

        return soccerLeague;
    }

    @Override
    public void delete(String s) {

    }


    public Set<SoccerLeague> getAll(){
        return this.soccerLeagues;
    }
}
