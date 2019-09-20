package za.ac.cput.projects.assignment7crud.factoryTest.SettingsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.Settings.DefaultSettings;
import za.ac.cput.projects.assignment7crud.factory.SettingsFactory.DefaultSettingsFactory;

public class DefaultSettingsTest {
    DefaultSettings settings;

    @Before
    public void setUp() {
        settings = DefaultSettingsFactory.createDefaultSettings("Analog controller", "Full Screen", 10, "English");
    }

    @Test
    public void createDefaultSettings(){

        Assert.assertEquals(settings.getVolumeSettings(), settings.getVolumeSettings());
        System.out.println(settings.toString());

    }
}
