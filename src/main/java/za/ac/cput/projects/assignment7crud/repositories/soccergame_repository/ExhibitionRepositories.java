package za.ac.cput.projects.assignment7crud.repositories.soccergame_repository;



import za.ac.cput.projects.assignment7crud.domains.SoccerGame.ExhibitionMatch;

import java.util.HashSet;
import java.util.Set;

public class ExhibitionRepositories implements ExhibitionRepository {
    private static ExhibitionRepositories repository = null;
    private Set<ExhibitionMatch> exhibitionMatches;


    private ExhibitionRepositories(){
        this.exhibitionMatches = new HashSet<>();
    }

    public static ExhibitionRepositories getRepository(){
        if (repository == null) repository = new ExhibitionRepositories();
        return repository;
    }


    public ExhibitionMatch create(ExhibitionMatch exhibitionMatch){
        this.exhibitionMatches.add(exhibitionMatch);
        return exhibitionMatch;
    }

    @Override
    public ExhibitionMatch read(String s) {
        return null;
    }

    public ExhibitionMatch read(int exhibition){

        return null;
    }

    public void delete(int CupTournamentsId) {

        this.exhibitionMatches.remove(exhibitionMatches);
    }

    public ExhibitionMatch update(ExhibitionMatch exhibitionMatch){

        return exhibitionMatch;
    }

    @Override
    public void delete(String s) {

    }


    public Set<ExhibitionMatch> getAll(){
        return this.exhibitionMatches;
    }
}
