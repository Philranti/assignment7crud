package za.ac.cput.projects.assignment7crud.controllers.CreateNewGameControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/newGame")
public class NewGameController {


    @Autowired
    private NewGameServiceImpl service;

    @RequestMapping("/create")
    @ResponseBody
    public NewGame create(NewGame game){
       // game = CreateNewGameFactory.newGame("Hello world", "Hello");

        return service.create(game);
    }

    @GetMapping("/read/{gameId}")
    @ResponseBody
    public NewGame read(@PathVariable String gameId) {
        return service.read(gameId);
    }

    @PostMapping("/update")
    @ResponseBody
    public NewGame update(NewGame newGameName) {
        return service.update(newGameName);
    }

    @GetMapping("/delete/{gameId}")
    @ResponseBody
    public void delete(@PathVariable String gameId) {
        service.delete(gameId);

    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<NewGame> getAll(){
        return service.getAll();
    }

}
