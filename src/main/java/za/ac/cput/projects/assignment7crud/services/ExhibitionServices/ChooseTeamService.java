package za.ac.cput.projects.assignment7crud.services.ExhibitionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.ChooseTeamsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChooseTeamService implements ChooseTeamInterfaceService{
    @Autowired
    private  ChooseTeamService service = null;

    @Autowired
    private ChooseTeamsRepository repository;

    private ChooseTeamService() {

    }

    public ChooseTeamService getService(){

        if(service == null){
            return new ChooseTeamService();
        }
        return service;
    }



    @Override
    public ChooseTeams retrieveByDesc(String chooseTeams) {
        List<ChooseTeams> ChooseTeamsList = getAll();
        for(ChooseTeams ChooseTeams: ChooseTeamsList)
        {
            if(ChooseTeams.getChooseTeamA().equalsIgnoreCase(chooseTeams))
                return ChooseTeams;
        }
        return null;
    }

    @Override
    public ChooseTeams create(ChooseTeams ChooseTeams) {
        return this.repository.save(ChooseTeams);
    }

    @Override
    public ChooseTeams update(ChooseTeams ChooseTeams) {
        return this.repository.save(ChooseTeams);
    }


    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public ChooseTeams read(String s) {
        Optional<ChooseTeams> ChooseTeams = this.repository.findById(s);
        return ChooseTeams.orElse(null);

    }


    @Override
    public List<ChooseTeams> getAll() {
        return this.repository.findAll();
    }
}
