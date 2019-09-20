package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostAssists;

import java.util.HashSet;
import java.util.Set;

public class MostAssistRepositories implements MostAssistRepository {
    private static MostAssistRepositories repository = null;
    private Set<MostAssists> mostAssist;


    private MostAssistRepositories(){
        this.mostAssist = new HashSet<>();
    }

    public static MostAssistRepositories getRepository(){
        if (repository == null) repository = new MostAssistRepositories();
        return repository;
    }

    public MostAssists create(MostAssists mostAssist){
        this.mostAssist.add(mostAssist);
        return mostAssist;
    }

    @Override
    public MostAssists read(String s) {
        return null;
    }

    public MostAssists read(int mostAssist){

        return null;
    }

    public void delete(int mostAssistId) {

        this.mostAssist.remove(mostAssistId);
    }

    public MostAssists update(MostAssists mostAssist){

        return mostAssist;
    }

    @Override
    public void delete(String s) {

    }


    public Set<MostAssists> getAll(){
        return this.mostAssist;
    }
}
