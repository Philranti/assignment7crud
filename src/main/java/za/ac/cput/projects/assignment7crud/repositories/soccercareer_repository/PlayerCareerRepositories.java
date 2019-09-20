package za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.PlayerCareer;

import java.util.HashSet;
import java.util.Set;

public class PlayerCareerRepositories implements PlayerCareerRepository{
    private static PlayerCareerRepositories repository = null;
    private Set<PlayerCareer> playerCareer;


    private PlayerCareerRepositories(){
        this.playerCareer = new HashSet<>();
    }

    public static PlayerCareerRepositories getRepository(){
        if (repository == null) repository = new PlayerCareerRepositories();
        return repository;
    }

    public PlayerCareer create(PlayerCareer playerCareer){
        this.playerCareer.add(playerCareer);
        return playerCareer;
    }

    public PlayerCareer read(int playerCareer){

        return null;
    }

    public void delete(int PlayerCareerId) {

        this.playerCareer.remove(playerCareer);
    }

    public PlayerCareer update(PlayerCareer playerCareer){

        return playerCareer;
    }


    public Set<PlayerCareer> getAll(){
        return this.playerCareer;
    }

}
