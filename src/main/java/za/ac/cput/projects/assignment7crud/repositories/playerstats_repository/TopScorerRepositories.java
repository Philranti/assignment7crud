package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.TopGoalScorers;

import java.util.HashSet;
import java.util.Set;

public class TopScorerRepositories implements TopScorerRepository{
    private static TopScorerRepositories repository = null;
    private Set<TopGoalScorers> topScorer;


    private TopScorerRepositories(){
        this.topScorer = new HashSet<>();
    }

    public static TopScorerRepositories getRepository(){
        if (repository == null) repository = new TopScorerRepositories();
        return repository;
    }

    public TopGoalScorers create(TopGoalScorers topScorer){
        this.topScorer.add(topScorer);
        return topScorer;
    }

    @Override
    public TopGoalScorers read(String s) {
        return null;
    }

    public TopGoalScorers read(int topScorer){

        return null;
    }

    public void delete(int topScorerId) {

        this.topScorer.remove(topScorerId);
    }

    public TopGoalScorers update(TopGoalScorers topScorer){

        return topScorer;
    }

    @Override
    public void delete(String s) {

    }


    public Set<TopGoalScorers> getAll(){
        return this.topScorer;
    }
}
