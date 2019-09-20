package za.ac.cput.projects.assignment7crud.controllers.CupTournamentControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.ClubTournamentService;


import java.util.Set;

@RestController
@RequestMapping("club")
public class ClubTournamentControllersImpl {

    @Autowired
    private ClubTournamentService service;

    @RequestMapping("/create")
    @ResponseBody
    public ClubTournaments create(ClubTournaments clubTournaments){

        return service.create(clubTournaments);
    }

    @GetMapping("/read/{clubId}")
    @ResponseBody
    public ClubTournaments read(@PathVariable String clubId) {

        return service.read(clubId);
    }

    @PostMapping("/update")
    @ResponseBody
    public ClubTournaments update(ClubTournaments clubTournaments) {
        return service.update(clubTournaments);
    }

    @GetMapping("/delete/{clubId}")
    @ResponseBody
    public void delete(@PathVariable String clubId) {
        service.delete(clubId);

    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ClubTournaments> getAll(){
        return service.getAll();
    }
}
