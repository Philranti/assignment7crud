package za.ac.cput.projects.assignment7crud.repositories.defaultsettings_repository;

import za.ac.cput.projects.assignment7crud.domains.Settings.DefaultSettings;

import java.util.HashSet;
import java.util.Set;

public class SettingsRepositories implements SettingsRepository{
    private static SettingsRepositories repository = null;
    private Set<DefaultSettings> settings;


    private SettingsRepositories(){
        this.settings = new HashSet<>();
    }

    public static SettingsRepositories getRepository(){
        if (repository == null) repository = new SettingsRepositories();
        return repository;
    }


    public DefaultSettings create(DefaultSettings defaultSettings){
        this.settings.add(defaultSettings);
        return defaultSettings;
    }

    @Override
    public DefaultSettings read(String s) {
        return null;
    }

    public DefaultSettings read(int exhibition){

        return null;
    }

    public void delete(int CupTournamentsId) {

        this.settings.remove(settings);
    }

    public DefaultSettings update(DefaultSettings defaultSettings){

        return defaultSettings;
    }

    @Override
    public void delete(String s) {

    }


    public Set<DefaultSettings> getAll(){
        return this.settings;
    }
}

