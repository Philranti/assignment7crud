package za.ac.cput.projects.assignment7crud.repositories.newgame_repository;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;

import java.util.*;

@Repository
public class CreateNewGameRepositories implements CreateNewGameRepository{
    private static CreateNewGameRepositories repository = null;
    private Map<String, NewGame> newGame;
    private Set<NewGame> newGames;


    private CreateNewGameRepositories(){
        this.newGame = new HashMap<>();
    }

    public static CreateNewGameRepositories getRepository(){
        if (repository == null) repository = new CreateNewGameRepositories();
        return repository;
    }

    @Override
    public NewGame create(NewGame newGame){
        this.newGame.put(newGame.getCreateName(), newGame);
        return newGame;
    }

    @Override
    public NewGame read(String newGame){
        return this.newGame.get(newGame);
    }

    @Override
    public NewGame update(NewGame s) {
        this.newGame.replace(s.getCreateName(), s);
        return this.newGame.get(s.getCreateName());
    }

    @Override
    public void delete(String s) {
    this.newGame.remove(s);
    }


    @Override
    public NewGame retrieveByGameName(String newGame) {
        return this.newGames.stream().filter(newGames -> newGames.getCreateName().equalsIgnoreCase(newGame)).findAny().orElse(null);
    }

    @Override
    public Set<NewGame> getAll(){
        Collection<NewGame> newGames = this.newGame.values();
        Set<NewGame> set = new HashSet<>();
        set.addAll(newGames);
        return set;
    }
}
