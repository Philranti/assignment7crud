package za.ac.cput.projects.assignment7crud.repositories.newgame_repository;

import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;

import java.util.*;


public class CreateNewGameRepositories implements CreateNewGameRepository{
    private static CreateNewGameRepositories repository = null;
    private Map<String, NewGame> newGame;


    private CreateNewGameRepositories(){
        this.newGame = new HashMap<>();
    }

    public static CreateNewGameRepositories getRepository(){
        if (repository == null) repository = new CreateNewGameRepositories();
        return repository;
    }


    public NewGame create(NewGame newGame){
        this.newGame.put(newGame.getCreateName(), newGame);
        return newGame;
    }




    public NewGame read(String newGame){
        return this.newGame.get(newGame);
    }


    public NewGame update(NewGame s) {
        this.newGame.replace(s.getCreateName(), s);
        return this.newGame.get(s.getCreateName());
    }




    public void delete(String s) {
    this.newGame.remove(s);
    }




    public Set<NewGame> getAll(){
        Collection<NewGame> newGames = this.newGame.values();
        Set<NewGame> set = new HashSet<>();
        set.addAll(newGames);
        return set;
    }
}
