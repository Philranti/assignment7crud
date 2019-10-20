package za.ac.cput.projects.assignment7crud.controllers.ExhibitionControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import za.ac.cput.projects.assignment7crud.domains.CreateChooseTeams.ChooseTeams;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
//import za.ac.cput.projects.assignment7crud.services.CreateChooseTeamsServices.ChooseTeamsServiceImpl;
import za.ac.cput.projects.assignment7crud.services.ExhibitionServices.ChooseTeamService;

import java.util.List;

@RestController
@RequestMapping("/soccer/chooseTeam")
public class ChooseTeamController {
    @Autowired
    ChooseTeamService service;

    ChooseTeams chooseTeams;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChooseTeams create(@RequestBody ChooseTeams create){
        //   game = CreateChooseTeamsFactory.ChooseTeams("Hello world", "Hello");
        return service.create(create);
    }

    @GetMapping(value="/read")
    public ChooseTeams read(@PathVariable String gameId) {
        return service.read(gameId);

    }

    @PutMapping(value = "/update")
    public ChooseTeams update(@RequestBody ChooseTeams ChooseTeamsName){
        return service.update(ChooseTeamsName);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@PathVariable String gameId) {
        service.delete(gameId);

    }

    @GetMapping(value = "/getall")
    public List<ChooseTeams> getAll(){
        return this.service.getAll();
    }

}
