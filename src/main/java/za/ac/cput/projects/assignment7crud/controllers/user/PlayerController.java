package za.ac.cput.projects.assignment7crud.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.ResponseObject;
import za.ac.cput.projects.assignment7crud.domains.request.NewPlayer;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
import za.ac.cput.projects.assignment7crud.factory.ResponseObjFactory;
import za.ac.cput.projects.assignment7crud.factory.user.PlayerFactory;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServiceImpl;
import za.ac.cput.projects.assignment7crud.services.users.playerServiceImpl;

@RestController
@RequestMapping("/soccer/player")
public class PlayerController {
   @Autowired
    private NewGameServiceImpl newGameService;

   @Autowired
   private playerServiceImpl playerService;
 /*   @Autowired
    private RaceServiceImpl raceService;
    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private EmployeeGenderServiceImpl employeeGenderService;
    @Autowired
    private EmployeeRaceServiceImpl employeeRaceService;*/

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEmployee(@RequestBody NewPlayer player) {
        System.out.println(player);
        ResponseObject responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Employee created!");
        if (player.getFirstname() == null || player.getNewGameName() == null) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Please provide first name or new game name!");
        } else {
            NewGame newGame = getNewGame(player);
           // Race race = getRace(employee);
            if (newGame == null) {
                responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String message = newGame == null ? "Game not found|" : "";
               // message += race == null ? "Race not found" : "";
                responseObj.setResponseDescription(message);
            } else {
               Player savedPlayer = savePlayer(player);
                NewGame savedNew = saveNewGame(savedPlayer, newGame);
              //  EmployeeRace savedEmpRace = saveEmployeeRace(savedEmp, race);
                responseObj.setResponse(savedNew);
            }
        }
        return ResponseEntity.ok(responseObj);
    }

 /*   private EmployeeRace saveEmployeeRace(Employee savedEmp, Race race) {
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace(savedEmp.getEmail(), race.getId());
        return employeeRaceService.create(employeeRace);
    }*/

    private NewGame saveNewGame(Player player, NewGame newGm) {
        NewGame newGame = CreateNewGameFactory.newGame(player.getEmail(), newGm.getCreateName());
        return newGameService.create(newGame);
    }

    private Player savePlayer(NewPlayer newPlayer) {
        Player play = PlayerFactory.createPlayer(newPlayer.getFirstname(), newPlayer.getLastname(),newPlayer.getEmail());
        return playerService.create(play);
    }

   /* private Race getRace(NewEmployee employee) {
        return raceService.retrieveByDesc(employee.getRace());
    }*/

    private NewGame getNewGame(NewPlayer newGame) {
        return newGameService.retrieveByDesc(newGame.getNewGameName());
    }
}
