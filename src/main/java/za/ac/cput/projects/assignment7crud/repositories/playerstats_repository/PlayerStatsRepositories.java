package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.PlayerStats;

import java.util.HashSet;
import java.util.Set;

public class PlayerStatsRepositories implements PlayerStatsRepository{
    private static PlayerStatsRepositories repository = null;
    private Set<PlayerStats> playerStat;


    private PlayerStatsRepositories(){
        this.playerStat = new HashSet<>();
    }

    public static PlayerStatsRepositories getRepository(){
        if (repository == null) repository = new PlayerStatsRepositories();
        return repository;
    }

    public PlayerStats create(PlayerStats playerStat){
        this.playerStat.add(playerStat);
        return playerStat;
    }

    @Override
    public PlayerStats read(String s) {
        return null;
    }

    public PlayerStats read(int playerStat){

        return null;
    }

    public void delete(int playerStatId) {

        this.playerStat.remove(playerStatId);
    }

    public PlayerStats update(PlayerStats playerStat){

        return playerStat;
    }

    @Override
    public void delete(String s) {

    }


    public Set<PlayerStats> getAll(){
        return this.playerStat;
    }
}
