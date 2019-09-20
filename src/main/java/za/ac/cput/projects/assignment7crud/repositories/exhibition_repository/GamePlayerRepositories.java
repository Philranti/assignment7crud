package za.ac.cput.projects.assignment7crud.repositories.exhibition_repository;

import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;

import java.util.HashSet;
import java.util.Set;

public class GamePlayerRepositories implements GamePlayerRepository{
    private static GamePlayerRepositories repository = null;
    private Set<GamePlay> gamePlay;


    private GamePlayerRepositories(){
        this.gamePlay = new HashSet<>();
    }

    public static GamePlayerRepositories getRepository(){
        if (repository == null) repository = new GamePlayerRepositories();
        return repository;
    }


    public GamePlay create(GamePlay GamePlay){
        this.gamePlay.add(GamePlay);
        return GamePlay;
    }

    public GamePlay read(String gamePlay){

        return null;
    }

    public void delete(String gamePlayId) {

        this.gamePlay.remove(gamePlayId);
    }

    public GamePlay update(GamePlay GamePlay){

        return GamePlay;
    }


    public Set<GamePlay> getAll(){
        return this.gamePlay;
    }
}
