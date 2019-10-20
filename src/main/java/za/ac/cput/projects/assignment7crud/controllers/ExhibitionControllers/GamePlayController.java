package za.ac.cput.projects.assignment7crud.controllers.ExhibitionControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import za.ac.cput.projects.assignment7crud.domains.CreateGamePlay.GamePlay;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;
//import za.ac.cput.projects.assignment7crud.services.CreateGamePlayServices.GamePlayServiceImpl;
import za.ac.cput.projects.assignment7crud.services.ExhibitionServices.GamePlayService;

import java.util.List;

@RestController
@RequestMapping("/soccer/gamePlay")
public class GamePlayController {
    @Autowired
    GamePlayService service;

    GamePlay gamePlay;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public GamePlay create(@RequestBody GamePlay create){
        //   game = CreateGamePlayFactory.GamePlay("Hello world", "Hello");
        return service.create(create);
    }

    @GetMapping(value="/read")
    public GamePlay read(@PathVariable String gameId) {
        return service.read(gameId);

    }

    @PutMapping(value = "/update")
    public GamePlay update(@RequestBody GamePlay GamePlayName){
        return service.update(GamePlayName);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@PathVariable String gameId) {
        service.delete(gameId);

    }

    @GetMapping(value = "/getall")
    public List<GamePlay> getAll(){
        return this.service.getAll();
    }

}
