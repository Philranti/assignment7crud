package za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository;

import za.ac.cput.projects.assignment7crud.domains.SoccerCareer.CoachingCareer;

import java.util.HashSet;
import java.util.Set;

public class CoachingCareerRepositories implements CoachingCareerRepository{
    private static CoachingCareerRepositories repository = null;
    private Set<CoachingCareer> coachingCareer;


    private CoachingCareerRepositories(){
        this.coachingCareer = new HashSet<>();
    }

    public static CoachingCareerRepositories getRepository(){
        if (repository == null) repository = new CoachingCareerRepositories();
        return repository;
    }

    public CoachingCareer create(CoachingCareer coachingCareer){
        this.coachingCareer.add(coachingCareer);
        return coachingCareer;
    }

    @Override
    public CoachingCareer read(String s) {
        return null;
    }

    public CoachingCareer read(int coachingCareer){

        return null;
    }

    public void delete(int coachingCareerId) {

        this.coachingCareer.remove(coachingCareer);
    }

    public CoachingCareer update(CoachingCareer coachingCareer){

        return coachingCareer;
    }

    @Override
    public void delete(String s) {

    }


    public Set<CoachingCareer> getAll(){
        return this.coachingCareer;
    }
}
