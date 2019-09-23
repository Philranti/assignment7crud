package za.ac.cput.projects.assignment7crud.controllers.CreateNewGameControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.ResponseObject;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
import za.ac.cput.projects.assignment7crud.factory.ResponseObjFactory;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/soccer/lookup/newGame")
public class NewGameController {


    @Autowired
    NewGameServiceImpl service;

    @RequestMapping("/create")
    @ResponseBody
    public NewGame create(NewGame game){
        game = CreateNewGameFactory.newGame("Hello world", "Hello");

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


    @PostMapping(value = "/create/{newGame}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createNewGame(@PathVariable String newGame) {
        System.out.println("Entered Value: " + newGame);
        ResponseObject responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "New Game created!");
        NewGame savedGender;
        if (newGame == null || newGame.trim().isEmpty() || newGame.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide a new game Name!");
        } else {
            savedGender = service.retrieveByDesc(newGame);
            if (savedGender != null) {
                responseObj.setResponseDescription("Gender already exist!");
            } else {
                savedGender =  CreateNewGameFactory.newGame(newGame, newGame);
                savedGender = service.create(savedGender);
            }
            responseObj.setResponse(savedGender);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObject responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<NewGame> newGames = service.getAll();
        responseObj.setResponse(newGames);
        return ResponseEntity.ok(responseObj);
    }

}
