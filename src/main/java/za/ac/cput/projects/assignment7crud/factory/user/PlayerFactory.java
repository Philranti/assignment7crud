package za.ac.cput.projects.assignment7crud.factory.user;

import za.ac.cput.projects.assignment7crud.domains.users.Player;

public class PlayerFactory {
    public static Player createPlayer(String firstName, String lastName, String email) {
        return new Player.Builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .build();
    }
}
