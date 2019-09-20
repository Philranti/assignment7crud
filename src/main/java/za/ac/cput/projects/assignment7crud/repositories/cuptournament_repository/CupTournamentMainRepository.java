package za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository;

public interface CupTournamentMainRepository <S, ID> {
    S create(S s);
    S read(ID id);
    S update(S s);
    void delete(ID id);
}

