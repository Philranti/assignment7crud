package za.ac.cput.projects.assignment7crud.factory.user;

import za.ac.cput.projects.assignment7crud.util.Misc;
import za.ac.cput.projects.assignment7crud.domains.users.Player;

public class PlayerFactory {
    private static final String SUFFIX = Misc.getSuffixFromClassName(PlayerFactory.class);
    public static Player createPlayer(String firstName, String lastName, String email) {
        return new Player.Builder()
                .playerId(SUFFIX)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .build();
    }
}
