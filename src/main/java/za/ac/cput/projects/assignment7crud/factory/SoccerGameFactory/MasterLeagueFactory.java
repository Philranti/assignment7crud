package za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory;

import za.ac.cput.projects.assignment7crud.domains.SoccerGame.MasterLeague;

public class MasterLeagueFactory {
    public static MasterLeague createMasterLeage(String masterLeagueName, String teamChosen) {
        return new MasterLeague.Builder()
                .masterLeagueName(masterLeagueName)
                .teamChosen(teamChosen)
                .build();
    }
}
