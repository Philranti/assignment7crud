package za.ac.cput.projects.assignment7crud.repositories.playerstats_repository;

import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostCleanSheets;

import java.util.HashSet;
import java.util.Set;

public class MostCleanSheetsRepositories implements MostCleanSheetsRepository {
    private static MostCleanSheetsRepositories repository = null;
    private Set<MostCleanSheets> cleanSheet;


    private MostCleanSheetsRepositories(){
        this.cleanSheet = new HashSet<>();
    }

    public static MostCleanSheetsRepositories getRepository(){
        if (repository == null) repository = new MostCleanSheetsRepositories();
        return repository;
    }

    public MostCleanSheets create(MostCleanSheets cleanSheet){
        this.cleanSheet.add(cleanSheet);
        return cleanSheet;
    }

    @Override
    public MostCleanSheets read(String s) {
        return null;
    }

    public MostCleanSheets read(int cleanSheet){

        return null;
    }

    public void delete(int cleanSheetId) {

        this.cleanSheet.remove(cleanSheetId);
    }

    public MostCleanSheets update(MostCleanSheets cleanSheet){

        return cleanSheet;
    }

    @Override
    public void delete(String s) {

    }


    public Set<MostCleanSheets> getAll(){
        return this.cleanSheet;
    }
}
