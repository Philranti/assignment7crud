package za.ac.cput.projects.assignment7crud.repositories.soccerleague_repository;

public interface SoccerLeagueMainRepository <S, ID> {
    S create(S s);
    S read(int id);
    S update(S s);
    void delete(ID id);
}
