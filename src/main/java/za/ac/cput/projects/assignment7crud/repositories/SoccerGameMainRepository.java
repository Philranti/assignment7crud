package za.ac.cput.projects.assignment7crud.repositories;

public   interface SoccerGameMainRepository <T, ID> {
        T create(T s);
        T read(ID s);
        T update(T s);
        void delete(ID s);
}
