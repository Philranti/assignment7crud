package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostYellowCards;

import java.util.HashSet;
import java.util.Set;

public class MostYellowCardRepositories implements MostYellowCardRepository{
    private static MostYellowCardRepositories repository = null;
    private Set<MostYellowCards> mostYellowCard;


    private MostYellowCardRepositories(){
        this.mostYellowCard = new HashSet<>();
    }

    public static MostYellowCardRepositories getRepository(){
        if (repository == null) repository = new MostYellowCardRepositories();
        return repository;
    }

    public MostYellowCards create(MostYellowCards mostYellowCard){
        this.mostYellowCard.add(mostYellowCard);
        return mostYellowCard;
    }

    @Override
    public MostYellowCards read(String s) {
        return null;
    }

    public MostYellowCards read(int mostYellowCard){

        return null;
    }

    public void delete(int mostYellowCardId) {

        this.mostYellowCard.remove(mostYellowCardId);
    }

    public MostYellowCards update(MostYellowCards mostYellowCard){

        return mostYellowCard;
    }

    @Override
    public void delete(String s) {

    }


    public Set<MostYellowCards> getAll(){
        return this.mostYellowCard;
    }
}
