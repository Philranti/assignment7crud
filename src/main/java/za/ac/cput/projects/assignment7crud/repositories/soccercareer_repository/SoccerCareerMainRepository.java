package za.ac.cput.projects.assignment7crud.repositories.soccercareer_repository;

public interface SoccerCareerMainRepository <S, ID> {
    S create(S s);
    S read(int id);
    S update(S s);
    void delete(int id);
}
