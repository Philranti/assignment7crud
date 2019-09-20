package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

public interface MasterLeagueMainRepository <S, ID> {
    S create(S s);
    S read(ID id);
    S update(S s);
    void delete(ID id);
}
