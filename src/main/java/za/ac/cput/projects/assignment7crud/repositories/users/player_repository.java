package za.ac.cput.projects.assignment7crud.repositories.users;

import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.users.Player;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
public class player_repository implements playerRepository {
    private Set<Player> Players;
    private static playerRepository PlayerRepository;

    private player_repository() {
        this.Players = new HashSet<>();
    }

    public static player_repository getPlayerRepository() {
        if (PlayerRepository == null) PlayerRepository = new player_repository();
        return (player_repository) PlayerRepository;
    }


    @Override
    public Player create(Player Player) {
        this.Players.add(Player);
        return Player;
    }

    @Override
    public Player read(String s) {
        Player Player = this.Players.stream()
                .filter(e -> e.getEmail().equalsIgnoreCase(s))
                .findAny().orElse(null);
        return Player;
    }

    @Override
    public Player update(Player Player) {
        Player emp = read(Player.getEmail());
        if (emp != null) {
            Player updated = new Player.Builder().copy(emp)
                    .firstName(Player.getFirstName())
                    .build();
            delete(emp.getEmail());
            this.Players.add(updated);
            emp = updated;
        }
        return emp;
    }

    @Override
    public void delete(String s) {
        Player Player = read(s);
        this.Players.remove(Player);
    }


    @Override
    public Set<Player> getAll() {
        return this.PlayerRepository.getAll();
    }

}
