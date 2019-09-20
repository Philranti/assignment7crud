package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostRedCards;

import java.util.HashSet;
import java.util.Set;

public class MostRedCardsRepositories implements MostRedCardsRepository{
    private static MostRedCardsRepositories repository = null;
    private Set<MostRedCards> mostRedCard;


    private MostRedCardsRepositories(){
        this.mostRedCard = new HashSet<>();
    }

    public static MostRedCardsRepositories getRepository(){
        if (repository == null) repository = new MostRedCardsRepositories();
        return repository;
    }

    public MostRedCards create(MostRedCards mostRedCard){
        this.mostRedCard.add(mostRedCard);
        return mostRedCard;
    }

    @Override
    public MostRedCards read(String s) {
        return null;
    }

    public MostRedCards read(int mostRedCard){

        return null;
    }

    public void delete(int mostRedCardId) {

        this.mostRedCard.remove(mostRedCardId);
    }

    public MostRedCards update(MostRedCards mostRedCard){

        return mostRedCard;
    }

    @Override
    public void delete(String s) {

    }


    public Set<MostRedCards> getAll(){
        return this.mostRedCard;
    }
}
