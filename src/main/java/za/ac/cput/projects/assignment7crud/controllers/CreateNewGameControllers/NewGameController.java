package za.ac.cput.projects.assignment7crud.controllers.CreateNewGameControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.ResponseObject;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
import za.ac.cput.projects.assignment7crud.factory.ResponseObjFactory;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/")
public class NewGameController {


    @Autowired
    NewGameServiceImpl service;



   // @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
   /* @PutMapping(value = "/create/{id}/{newGame}/{savedGame}")
    public NewGame create(@PathVariable String id, @PathVariable String newGame, @PathVariable String savedGame){
     //   game = CreateNewGameFactory.newGame("Hello world", "Hello");
        return this.service.create(CreateNewGameFactory.newGame(id, newGame, savedGame));
    }

    @GetMapping(value = "/read/{gameId}")
    public NewGame read(@PathVariable String gameId) {
             return this.service.read(gameId);

    }

    @PutMapping(value = "/update/newGame")
    public NewGame update(@RequestBody NewGame newGameName){
        return this.service.update(newGameName);
    }

    @DeleteMapping(value = "/delete/{gameId}")
    public void delete(@PathVariable String gameId) {
        this.service.delete(gameId);

    }

    @GetMapping(value = "/getAll")
    public List<NewGame> getAll(){
        return this.service.getAll();
    }

   /*     @PostMapping(value = "/create/{newGame}", produces = MediaType.APPLICATION_JSON_VALUE)
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

*/



}
