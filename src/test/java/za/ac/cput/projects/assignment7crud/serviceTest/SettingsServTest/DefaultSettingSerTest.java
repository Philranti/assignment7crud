package za.ac.cput.projects.assignment7crud.serviceTest.SettingsServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.Settings.DefaultSettings;
import za.ac.cput.projects.assignment7crud.factory.SettingsFactory.DefaultSettingsFactory;
import za.ac.cput.projects.assignment7crud.repositories.defaultsettings_repository.SettingsRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultSettingSerTest {

    private SettingsRepositories repository;
    private DefaultSettings defaultSettings;

    private DefaultSettings getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SettingsRepositories.getRepository();
        this.defaultSettings = DefaultSettingsFactory.createDefaultSettings("Analog controller", "Full Screen", 10, "English");
    }

    @Test
    public void a_create() {
        DefaultSettings created = this.repository.create(this.defaultSettings);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.defaultSettings);
    }

    @Test
    public void c_update() {
        String languageSettings = "Xhosa";
        DefaultSettings updated = new DefaultSettings.Builder().language(languageSettings).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(languageSettings, updated.getLanguage());
    }

   /* @Test
    public void e_delete() {
        DefaultSettings saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getLanguage()));
        d_getAll();
    }*/

  /*  @Test
    public void b_read() {
        DefaultSettings saved = getSaved();
        DefaultSettings read = this.repository.read(Integer.parseInt(saved.getLanguage()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }*/

    @Test
    public void d_getAll() {
        Set<DefaultSettings> DefaultSettings = this.repository.getAll();
        System.out.println("In getall, all = " + DefaultSettings);
    }
}
