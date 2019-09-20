package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerGame.MasterLeague;

import java.util.HashSet;
import java.util.Set;

public class MasterLeagueRepositories implements MasterLeagueRepository {
    private static MasterLeagueRepositories repository = null;
    private Set<MasterLeague> masterLeagues;


    private MasterLeagueRepositories(){
        this.masterLeagues = new HashSet<>();
    }

    public static MasterLeagueRepositories getRepository(){
        if (repository == null) repository = new MasterLeagueRepositories();
        return repository;
    }


    public MasterLeague create(MasterLeague masterLeague){
        this.masterLeagues.add(masterLeague);
        return masterLeague;
    }

    @Override
    public MasterLeague read(String s) {
        return null;
    }

    public MasterLeague read(int masterLeague){

        return null;
    }

    public void delete(int CupTournamentsId) {

    }

    public MasterLeague update(MasterLeague masterLeague){

        return masterLeague;
    }

    @Override
    public void delete(String s) {

    }


    public Set<MasterLeague> getAll(){
        return this.masterLeagues;
    }
}
