package za.ac.cput.projects.assignment7crud.factory.SettingsFactory;

import za.ac.cput.projects.assignment7crud.domains.Settings.DefaultSettings;

public class DefaultSettingsFactory {
    public static DefaultSettings createDefaultSettings(String controllerSettings, String onscreenDisplay, int volumeSettings, String language) {
        return new DefaultSettings.Builder()
                .controllerSettings(controllerSettings)
                .onscreenDisplay(onscreenDisplay)
                .volumeSettings(volumeSettings)
                .language(language)
                .build();
    }
}
