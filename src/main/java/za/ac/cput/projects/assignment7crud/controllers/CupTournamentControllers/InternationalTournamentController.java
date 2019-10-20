package za.ac.cput.projects.assignment7crud.controllers.CupTournamentControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import za.ac.cput.projects.assignment7crud.domains.CreateInternationalTournaments.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
//import za.ac.cput.projects.assignment7crud.services.CreateInternationalTournamentsServices.InternationalTournamentsServiceImpl;
import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.InternationalService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/soccer/internationalTournament")
public class InternationalTournamentController {

    @Autowired
    InternationalService service;

    InternationalTournaments internationalTournaments;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public InternationalTournaments create(@RequestBody InternationalTournaments create){
        //   game = CreateInternationalTournamentsFactory.InternationalTournaments("Hello world", "Hello");
        return service.create(create);
    }

    @GetMapping(value="/read")
    public InternationalTournaments read(@PathVariable String gameId) {
        return service.read(gameId);

    }

    @PutMapping(value = "/update")
    public InternationalTournaments update(@RequestBody InternationalTournaments InternationalTournamentsName){
        return service.update(InternationalTournamentsName);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@PathVariable String gameId) {
        service.delete(gameId);

    }

    @GetMapping(value = "/getall")
    public List<InternationalTournaments> getAll(){
        return this.service.getAll();
    }

}
