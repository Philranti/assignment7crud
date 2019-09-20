package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.LeagueStats;

import java.util.HashSet;
import java.util.Set;

public class LeagueStatsRepositories implements LeagueStatsRepository{
    private static LeagueStatsRepositories repository = null;
    private Set<LeagueStats> leagueStats;


    private LeagueStatsRepositories(){
        this.leagueStats = new HashSet<>();
    }

    public static LeagueStatsRepositories getRepository(){
        if (repository == null) repository = new LeagueStatsRepositories();
        return repository;
    }

    public LeagueStats create(LeagueStats leagueStats){
        this.leagueStats.add(leagueStats);
        return leagueStats;
    }

    public LeagueStats read(int leagueStats){

        return null;
    }

    public void delete(String leagueStatsId) {

        this.leagueStats.remove(leagueStatsId);
    }

    public LeagueStats update(LeagueStats leagueStats){

        return leagueStats;
    }


    public Set<LeagueStats> getAll(){
        return this.leagueStats;
    }
}
