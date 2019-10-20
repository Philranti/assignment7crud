package za.ac.cput.projects.assignment7crud.services.CreateNewgameServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
//import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepositories;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepository;
import za.ac.cput.projects.assignment7crud.services.MainService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class NewGameServiceImpl implements NewGameServices {


    @Autowired
    private  NewGameServiceImpl service = null;

    @Autowired
   private CreateNewGameRepository repository;

    private NewGameServiceImpl() {

    }

    public NewGameServiceImpl getService(){

        if(service == null){
            return new NewGameServiceImpl();
        }
        return service;
    }



    @Override
    public NewGame retrieveByDesc(String gameName) {
        List<NewGame> newGameList = getAll();
        for(NewGame newGame: newGameList)
        {
            if(newGame.getCreateName().equalsIgnoreCase(gameName))
                return newGame;
        }
        return null;
    }

    @Override
    public NewGame create(NewGame newGame) {
        return this.repository.save(newGame);
    }

    @Override
    public NewGame update(NewGame newGame) {
        return this.repository.save(newGame);
    }


    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public NewGame read(String s) {
        Optional<NewGame> newGame = this.repository.findById(s);
        return newGame.orElse(null);

    }


    @Override
    public List<NewGame> getAll() {
        return this.repository.findAll();
    }
}

