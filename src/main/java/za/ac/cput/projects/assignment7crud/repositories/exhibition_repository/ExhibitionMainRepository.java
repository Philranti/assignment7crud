package za.ac.cput.projects.assignment7crud.repositories.exhibition_repository;

public interface ExhibitionMainRepository <S, ID> {
    S create(S s);
    S read(ID id);
    S update(S s);
    void delete(ID id);
}
