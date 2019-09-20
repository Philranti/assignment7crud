package za.ac.cput.projects.assignment7crud.repositories.exhibition_repository;

import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.ClubTournaments;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.ChooseTeams;

import java.util.*;

@Repository
public class ChooseTeamRepositories implements ChooseTeamsRepository{
    private static ChooseTeamRepositories repository = null;
    private Map<String,ChooseTeams> chooseTeams;


    private ChooseTeamRepositories(){
        this.chooseTeams = new HashMap<>();
    }

    public static ChooseTeamRepositories getRepository(){
        if (repository == null) repository = new ChooseTeamRepositories();
        return repository;
    }


    public ChooseTeams create(ChooseTeams ChooseTeams){
        this.chooseTeams.put(ChooseTeams.getChooseTeamA(), ChooseTeams);
        return ChooseTeams;
    }

    public ChooseTeams read(String chooseTeam){

        return this.chooseTeams.get(chooseTeam);
    }

    public void delete(String CupTournamentsId) {

        this.chooseTeams.remove(chooseTeams);
    }

    public ChooseTeams update(ChooseTeams ChooseTeams){

        this.chooseTeams.replace(ChooseTeams.getChooseTeamA(), ChooseTeams);
        return this.chooseTeams.get(ChooseTeams.getChooseTeamA());

    }


    public Set<ChooseTeams> getAll(){

        Collection<ChooseTeams> chooseTeams = this.chooseTeams.values();
        Set<ChooseTeams> set = new HashSet<>();
        set.addAll(chooseTeams);
        return set;
    }
}
