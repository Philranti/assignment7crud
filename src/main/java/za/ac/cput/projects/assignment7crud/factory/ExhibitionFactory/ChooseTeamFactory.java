package za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory;

import za.ac.cput.projects.assignment7crud.util.Misc;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;

public class ChooseTeamFactory {
    private static final String SUFFIX = Misc.getSuffixFromClassName(ChooseTeamFactory.class);
    public static ChooseTeams createTeams(String chooseTeamA, String chooseTeamB) {
        return new ChooseTeams.Builder()
                .teamId(SUFFIX)
                .chooseTeamA(chooseTeamA)
                .chooseTeamB(chooseTeamB)
                .build();
    }
}
