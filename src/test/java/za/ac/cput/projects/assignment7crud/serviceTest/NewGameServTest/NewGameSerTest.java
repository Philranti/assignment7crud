package za.ac.cput.projects.assignment7crud.serviceTest.NewGameServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
//import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepositories;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServices;

import java.util.List;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewGameSerTest {

    @Autowired
    private NewGameServices services;

    NewGame newGame;

    private NewGame getSaved(){
        return this.services.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.newGame = CreateNewGameFactory.newGame(newGame.getGameId(),"PhillipMphelaGame", "PhilGame" );
    }

    @Test
    public void a_create() {
        NewGame created = this.services.create(this.newGame);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.newGame);
    }

    @Test
    public void c_update() {
        String renameNewGame = "tournament1";
        NewGame updated = new NewGame.Builder().createName(renameNewGame).build();
        System.out.println("In update, updated = " + updated);
        this.services.update(updated);
        Assert.assertSame(renameNewGame, updated.getCreateName());
    }

    @Test
    public void e_delete() {
        NewGame saved = getSaved();
        this.services.delete(saved.getCreateName());
        d_getAll();
    }

    @Test
    public void b_read() {
        NewGame saved = getSaved();
        NewGame read = this.services.read(saved.getCreateName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        List<NewGame> NewGame = this.services.getAll();
        System.out.println("In getall, all = " + NewGame);
    }
}
