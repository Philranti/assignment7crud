package za.ac.cput.projects.assignment7crud.services.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.repositories.users.playerRepository;
import za.ac.cput.projects.assignment7crud.repositories.users.player_repository;

import java.util.HashSet;
import java.util.Set;

@Service
public class playerServiceImpl implements playerService{
    private static playerService service;

    @Autowired
    private playerRepository repository;

    private playerServiceImpl() {
        this.repository = player_repository.getPlayerRepository();
    }

    public  playerService getPlayerService() {
        if (service == null) service = new playerServiceImpl();
        return service;
    }


    @Override
    public Player create(Player player) {
        return this.repository.create(player);
    }

    @Override
    public Player read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Player update(Player player) {
        return this.repository.update(player);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Set<Player> getAll() {
        return this.repository.getAll();
    }
}
