package za.ac.cput.projects.assignment7crud.repositories.defaultsettings_repository;

import za.ac.cput.projects.assignment7crud.domains.Settings.DefaultSettings;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

public interface SettingsRepository extends SoccerGameMainRepository<DefaultSettings, String> {
    Set<DefaultSettings> getAll();
}
