package za.ac.cput.projects.assignment7crud.repositoryTest.NewGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.NewGameTest.NewGameTests;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepositories;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewGameRepoTests {

    @Autowired
    private NewGame newGame;
    private CreateNewGameRepository repository;



    private NewGame getSavedNewGame() {
        Set<NewGame> savedNewGameTransfer = this.repository.getAll();
        return savedNewGameTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CreateNewGameRepositories.getRepository();
        this.newGame = CreateNewGameFactory.newGame("PhillipMphelaGame", "PhilGame" );
    }

    @Test
    public void a_create() {
        NewGame created = this.repository.create(this.newGame);
        System.out.println("In create, created = " + created);
        c_getAll();
        Assert.assertSame(created, this.newGame);
    }

    @Test
    public void b_read() {
        NewGame savedNewGame = getSavedNewGame();

        NewGame read = this.repository.read(savedNewGame.getCreateName());
        System.out.println("In read, read = " + read);
        c_getAll();
        Assert.assertEquals(savedNewGame, read);
    }


    @Test
    public void e_delete() {
        NewGame savedNewGame = getSavedNewGame();
        this.repository.delete(savedNewGame.getCreateName());
        c_getAll();
    }

    @Test
    public void d_update() {
        String createNewGameName = "FifaGame1";
        NewGame NewGame = new NewGame.Builder().createName(createNewGameName).build();
        System.out.println("In update, about_to_updated = " +NewGame);
        NewGame updated = this.repository.create(NewGame);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createNewGameName, updated.getCreateName());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        Set<NewGame> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
