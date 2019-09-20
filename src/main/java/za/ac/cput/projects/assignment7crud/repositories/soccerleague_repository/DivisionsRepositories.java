package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerLeagues.Divisions;

import java.util.HashSet;
import java.util.Set;

public class DivisionsRepositories implements DivisionsRepository {
    private static DivisionsRepositories repository = null;
    private Set<Divisions> divisions;


    private DivisionsRepositories(){
        this.divisions = new HashSet<>();
    }

    public static DivisionsRepositories getRepository(){
        if (repository == null) repository = new DivisionsRepositories();
        return repository;
    }

    public Divisions create(Divisions divisions){
        this.divisions.add(divisions);
        return divisions;
    }

    public Divisions read(int divisions){
      /*  Divisions division = this.divisions.stream().filter(e-> e.equalsIsIgnoreCase(divisions))
                .findAny().orElse( null);*/
return null;

    }

    public void delete(String divisionsId) {

        this.divisions.remove(divisionsId);
    }

    public Divisions update(Divisions divisions){
     //   Divisions div =  read
        return divisions;
    }


    public Set<Divisions> getAll(){
        return this.divisions;
    }
}
