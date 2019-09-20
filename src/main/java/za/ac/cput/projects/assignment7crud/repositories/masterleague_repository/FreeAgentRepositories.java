package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;


import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.FreeAgents;

import java.util.*;

public class FreeAgentRepositories implements FreeAgentRepository{
    private static FreeAgentRepositories repository = null;
    private Map<String, FreeAgents> freeAgent;
    
    private FreeAgentRepositories(){
        this.freeAgent = new HashMap<>();
    }

    public static FreeAgentRepositories getRepository(){
        if (repository == null) repository = new FreeAgentRepositories();
        return repository;
    }
    public FreeAgents create(FreeAgents freeAgent){
        this.freeAgent.put(freeAgent.getFreeAgentPlayer(), freeAgent);
        return freeAgent;
    }

    public FreeAgents read(String freeAgent){

        return this.freeAgent.get(freeAgent);
    }

    public void delete(String freeAgentId) {

        this.freeAgent.remove(freeAgentId);
    }

    public FreeAgents update(FreeAgents freeAgent){
        this.freeAgent.replace(freeAgent.getFreeAgentPlayer(), freeAgent);
        return this.freeAgent.get(freeAgent.getFreeAgentPlayer());
    }


    public Set<FreeAgents> getAll(){
        Collection<FreeAgents> FreeAgents = this.freeAgent.values();
        Set<FreeAgents> set = new HashSet<>();
        set.addAll(FreeAgents);
        return set;
    }
}
