package za.ac.cput.projects.assignment7crud.services.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.repositories.users.playerRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class playerServiceImpl implements playerService{
    @Autowired
    private  playerServiceImpl service = null;

    @Autowired
    private playerRepository repository;

    private playerServiceImpl() {

    }

    public playerServiceImpl getService(){

        if(service == null){
            return new playerServiceImpl();
        }
        return service;
    }



    @Override
    public Player retrieveByDesc(String gameName) {
        List<Player> PlayerList = getAll();
        for(Player Player: PlayerList)
        {
            if(Player.getEmail().equalsIgnoreCase(gameName))
                return Player;
        }
        return null;
    }

    @Override
    public Player create(Player Player) {
        return this.repository.save(Player);
    }

    @Override
    public Player update(Player Player) {
        return this.repository.save(Player);
    }


    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Player read(String s) {
        Optional<Player> Player = this.repository.findById(s);
        return Player.orElse(null);

    }


    @Override
    public List<Player> getAll() {
        return this.repository.findAll();
    }
}
