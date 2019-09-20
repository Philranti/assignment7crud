package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.PromotePlayers;

import java.util.HashSet;
import java.util.Set;

public class PromotedPlayerRepositories implements PromotedPlayerRepository{
    private static PromotedPlayerRepositories repository = null;
    private Set<PromotePlayers> promote;


    private PromotedPlayerRepositories(){
        this.promote = new HashSet<>();
    }

    public static PromotedPlayerRepositories getRepository(){
        if (repository == null) repository = new PromotedPlayerRepositories();
        return repository;
    }

    public PromotePlayers create(PromotePlayers promote){
        this.promote.add(promote);
        return promote;
    }

    public PromotePlayers read(String promote){

        return null;
    }

    public void delete(String promoteId) {

        this.promote.remove(promoteId);
    }

    public PromotePlayers update(PromotePlayers promote){

        return promote;
    }


    public Set<PromotePlayers> getAll(){
        return this.promote;
    }
}
