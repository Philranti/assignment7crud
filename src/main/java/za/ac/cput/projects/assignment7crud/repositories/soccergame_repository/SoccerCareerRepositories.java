package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerGame.SoccerCareerLeague;

import java.util.HashSet;
import java.util.Set;

public class SoccerCareerRepositories implements SoccerCareerRepository {
    private static SoccerCareerRepositories repository = null;
    private Set<SoccerCareerLeague> soccerCareerLeagues;

    private SoccerCareerRepositories(){
        this.soccerCareerLeagues = new HashSet<>();
    }

    public static SoccerCareerRepositories getRepository(){
        if (repository == null) repository = new SoccerCareerRepositories();
        return repository;
    }


    public SoccerCareerLeague create(SoccerCareerLeague soccerCareerLeagues){
        this.soccerCareerLeagues.add(soccerCareerLeagues);
        return soccerCareerLeagues;
    }

    @Override
    public SoccerCareerLeague read(String s) {
        return null;
    }

    public SoccerCareerLeague read(int soccerCareerLeagues){

        return null;
    }

    public void delete(int soccerCareerLeagueId) {

    }

    public SoccerCareerLeague update(SoccerCareerLeague soccerCareerLeagues){

        return soccerCareerLeagues;
    }

    @Override
    public void delete(String s) {

    }


    public Set<SoccerCareerLeague> getAll(){
        return this.soccerCareerLeagues;
    }
}
