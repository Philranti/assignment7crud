package za.ac.cput.projects.assignment7crud.services.CreateNewgameServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepositories;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepository;

import java.util.Set;

@Service
public class NewGameServiceImpl implements NewGameServices {


    @Autowired
    private NewGameServiceImpl service = null;
   private CreateNewGameRepository repository;

    public NewGameServiceImpl() {
        repository = CreateNewGameRepositories.getRepository();
    }

    public NewGameServiceImpl getService(){

        if(service == null){
            return new NewGameServiceImpl();
        }
        return service;
    }

    @Override
    public NewGame create(NewGame newGame) {
        return this.repository.create(newGame);
    }

    @Override
    public NewGame update(NewGame newGame) {
        return this.repository.update(newGame);
    }


    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public NewGame read(String s) {
        return this.repository.read(s);
    }

    @Override
    public NewGame retrieveByDesc(String newDesc) {
        return this.repository.retrieveByGameName(newDesc);
    }

    @Override
    public Set<NewGame> getAll() {
        return this.repository.getAll();
    }
}

