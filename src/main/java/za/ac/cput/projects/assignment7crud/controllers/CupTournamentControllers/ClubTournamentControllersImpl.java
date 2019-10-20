package za.ac.cput.projects.assignment7crud.controllers.CupTournamentControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import za.ac.cput.projects.assignment7crud.domains.CreateClubTournaments.ClubTournaments;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.factory.CupTournamentFactory.ClubTournamentFactory;
//import za.ac.cput.projects.assignment7crud.services.CreateClubTournamentsServices.ClubTournamentsServiceImpl;
import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.ClubTournamentService;


import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/soccer/clubTournament")
public class ClubTournamentControllersImpl {

    @Autowired
    ClubTournamentService service;

    ClubTournaments clubTournaments;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ClubTournaments create(@RequestBody ClubTournaments clubTournaments1){
           clubTournaments = ClubTournamentFactory.createClubTournament("UEFA Champions League", 32, "Barcelona");
        return service.create(clubTournaments1);
    }

    @GetMapping(value="/read")
    public ClubTournaments read(@PathVariable String id) {
        return service.read(id);

    }

    @PutMapping(value = "/update")
    public ClubTournaments update(@RequestBody ClubTournaments ClubTournamentsName){
        return service.update(ClubTournamentsName);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@PathVariable String Id) {
        service.delete(Id);

    }

    @GetMapping(value = "/getall")
    public List<ClubTournaments> getAll(){
        return this.service.getAll();
    }

}
