package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerGame.CupTournaments;

import java.util.HashSet;
import java.util.Set;
//import java.util.Set;

public class CupTournamentRepositories implements CupTournamentRepository {
    private static CupTournamentRepositories repository = null;
    private Set<CupTournaments> cupTournaments;


    private CupTournamentRepositories(){
        this.cupTournaments = new HashSet<>();
    }

    public static CupTournamentRepositories getRepository(){
        if (repository == null) repository = new CupTournamentRepositories();
        return repository;
    }


    public CupTournaments create(CupTournaments CupTournaments){
        this.cupTournaments.add(CupTournaments);
        return CupTournaments;
    }

    @Override
    public CupTournaments read(String s) {
        return null;
    }

    public CupTournaments read(int CupTournamentsId){
        // find the CupTournaments that matches the id and return it if exist
        return null;
    }

    public void delete(int CupTournamentsId) {
        // find the CupTournaments, delete it if it exist
    }

    public CupTournaments update(CupTournaments CupTournaments){
        // find the CupTournaments, update it and delete it if it exists
        return CupTournaments;
    }

    @Override
    public void delete(String s) {

    }


    public Set<CupTournaments> getAll(){
        return this.cupTournaments;
    }
}
