package za.ac.cput.projects.assignment7crud.services.ExhibitionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.GamePlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GamePlayService implements GamePlayInterfaceService{
    @Autowired
    private  GamePlayService service = null;

    @Autowired
    private GamePlayerRepository repository;

    private GamePlayService() {

    }

    public GamePlayService getService(){

        if(service == null){
            return new GamePlayService();
        }
        return service;
    }



    @Override
    public GamePlay retrieveByDesc(String gamePlay) {
        List<GamePlay> GamePlayList = getAll();
        for(GamePlay GamePlay: GamePlayList)
        {
            if(GamePlay.getVenueChosen().equalsIgnoreCase(gamePlay))
                return GamePlay;
        }
        return null;
    }

    @Override
    public GamePlay create(GamePlay GamePlay) {
        return this.repository.save(GamePlay);
    }

    @Override
    public GamePlay update(GamePlay GamePlay) {
        return this.repository.save(GamePlay);
    }


    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public GamePlay read(String s) {
        Optional<GamePlay> GamePlay = this.repository.findById(s);
        return GamePlay.orElse(null);

    }


    @Override
    public List<GamePlay> getAll() {
        return this.repository.findAll();
    }
}
