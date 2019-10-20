package za.ac.cput.projects.assignment7crud.controllers.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.domains.ResponseObject;
import za.ac.cput.projects.assignment7crud.domains.request.NewPlayer;
import za.ac.cput.projects.assignment7crud.domains.users.Player;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
import za.ac.cput.projects.assignment7crud.factory.ResponseObjFactory;
import za.ac.cput.projects.assignment7crud.factory.user.PlayerFactory;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServiceImpl;
//import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.ClubTournamentService;
import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.ClubTournamentService;
import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.InternationalService;
import za.ac.cput.projects.assignment7crud.services.ExhibitionServices.ChooseTeamService;
import za.ac.cput.projects.assignment7crud.services.ExhibitionServices.GamePlayService;
import za.ac.cput.projects.assignment7crud.services.users.playerServiceImpl;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/soccer/player")
public class PlayerController {
    @Autowired
    private NewGameServiceImpl newGameService;

    @Autowired private ClubTournamentService clubTournamentService;

    @Autowired
    private InternationalService internationalService;

    @Autowired
    private playerServiceImpl playerService;

  @Autowired
   private ChooseTeamService chooseTeamService;

  @Autowired private GamePlayService gamePlayService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date - dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/list_player", method = RequestMethod.GET)
    public String showPlayer(ModelMap model) {
        String name = getLoggedInUserName(model);
        model.put("player", playerService.retrieveByDesc(name));

        return "list_player";
    }

    private String getLoggedInUserName(ModelMap model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }

    @RequestMapping(value = "/create_player", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        model.addAttribute("player", new Player.Builder());
        return "player";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam String id) {
        playerService.delete(id);

        return "redirect:/list_player";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam String id, ModelMap model) {
        Player player = playerService.retrieveByDesc(id);
        model.put("todo", player);
        return "todo";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Player player, BindingResult result) {

        if (result.hasErrors()) {
            return "player";
        }

        player.setPlayerId(getLoggedInUserName(model));
        playerService.update(player);
        return "redirect:/list_player";
    }

    @RequestMapping(value = "/create_player", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid Player player, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        player.setPlayerId(getLoggedInUserName(model));
        playerService.create(player);
        return "redirect:/list_player";
    }


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
        NewGame newGame = CreateNewGameFactory.newGame(newGm.getGameId(),  player.getEmail(), newGm.getCreateName());
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
