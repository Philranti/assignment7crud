package za.ac.cput.projects.assignment7crud.controllers.CupTournamentControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.services.CuptournamentServices.InternationalService;

import java.util.Set;

@RestController
@RequestMapping("/international")
public class InternationalTournamentController {

    @Autowired
    private InternationalService service;

    @RequestMapping("/create")
    @ResponseBody
    public InternationalTournaments create(InternationalTournaments internationalTournament){

        return service.create(internationalTournament);
    }

    @GetMapping("/read/{internationalId}")
    @ResponseBody
    public InternationalTournaments read(@PathVariable String internationalId) {
        return service.read(internationalId);
    }

    @PostMapping("/update")
    @ResponseBody
    public InternationalTournaments update(InternationalTournaments internationalTournaments) {
        return service.update(internationalTournaments);
    }

    @GetMapping("/delete/{internationalId}")
    @ResponseBody
    public void delete(@PathVariable String internationalId) {
        service.delete(internationalId);

    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<InternationalTournaments> getAll(){
        return service.getAll();
    }

}
