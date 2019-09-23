package za.ac.cput.projects.assignment7crud.repositoryTest.SettingsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.Settings.DefaultSettings;
import za.ac.cput.projects.assignment7crud.factory.SettingsFactory.DefaultSettingsFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.SettingsTest.DefaultSettingsTest;
import za.ac.cput.projects.assignment7crud.repositories.defaultsettings_repository.SettingsRepositories;
import za.ac.cput.projects.assignment7crud.repositories.defaultsettings_repository.SettingsRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultSettingsRepoTest {
    DefaultSettings settings;

    private SettingsRepository repository;
    private DefaultSettingsTest defaultSettingsTest;


    private DefaultSettings getSavedDefaultSettings() {
        Set<DefaultSettings> savedDefaultSettings = this.repository.getAll();
        return savedDefaultSettings.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SettingsRepositories.getRepository();
     //   this.settings = defaultSettingsTest.setUp();
    }

    @Test
    public void create() {
        DefaultSettings created = this.repository.create(this.settings);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.settings);
    }

   /* @Test
    public void read() {
        DefaultSettings savedDefaultSettings = getSavedDefaultSettings();

        DefaultSettings read = this.repository.read(savedDefaultSettings.getLanguage());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedDefaultSettings, read);
    }*/

    private DefaultSettings getsavedDefaultSettingsTransfer() {
        Set<DefaultSettings> savedDefaultSettingsTransfer = this.repository.getAll();
        return savedDefaultSettingsTransfer.iterator().next();
    }

   /* @Test
    public void delete() {
        DefaultSettings savedDefaultSettings = getSavedDefaultSettings();
        this.repository.delete(savedDefaultSettings.getLanguage());
        getAll();
    }*/

    @Test
    public void update() {
        String createDefaultSettings = "Xhosa";
        DefaultSettings DefaultSettings = new DefaultSettings.Builder().language(createDefaultSettings).build();
        System.out.println("In update, about_to_updated = " +DefaultSettings);
        DefaultSettings updated = this.repository.update(DefaultSettings);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createDefaultSettings, updated.getLanguage());
        getAll();
    }

    @Test
    public void getAll() {
        Set<DefaultSettings> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }

}
