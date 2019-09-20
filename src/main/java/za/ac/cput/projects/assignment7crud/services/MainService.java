package za.ac.cput.projects.assignment7crud.services;

public interface MainService <TYPE, ID> {
    TYPE create(TYPE type);
    TYPE update(TYPE type);
    void delete(ID id);
    TYPE read(ID id);
}
