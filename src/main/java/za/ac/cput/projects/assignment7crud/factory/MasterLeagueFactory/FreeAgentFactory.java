package za.ac.cput.projects.assignment7crud.factory.MasterLeagueFactory;


import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.FreeAgents;

public class FreeAgentFactory {
    public static FreeAgents freeAgents(String freeAgentPlayer) {
        return new FreeAgents.Builder()
                .freeAgentPlayer(freeAgentPlayer)
                .build();
    }
}
