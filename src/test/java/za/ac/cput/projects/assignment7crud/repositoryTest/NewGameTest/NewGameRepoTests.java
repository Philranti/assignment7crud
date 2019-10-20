package za.ac.cput.projects.assignment7crud.repositoryTest.NewGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
//import za.ac.cput.projects.assignment7crud.factoryTest.NewGameTest.NewGameTests;
//import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepositories;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepository;
import za.ac.cput.projects.assignment7crud.util.Misc;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewGameRepoTests {

    @Autowired
    private CreateNewGameRepository repository;

    NewGame newGame;

    private NewGame getSavedNewGame() {
        List<NewGame> savedNewGameTransfer = this.repository.findAll();
        return savedNewGameTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.newGame = CreateNewGameFactory.newGame(newGame.getGameId(),"PhillipMphelaGame", "PhilGame" );
    }

    @Test
    public void a_create() {
       newGame =  this.repository.save(this.newGame);
        System.out.println("In create, created = " + newGame.getCreateName());
        c_getAll();
        Assert.assertNotNull(newGame.getCreateName());
    }

    @Test
    public void b_read() {
        NewGame savedNewGame = getSavedNewGame();

        Optional<NewGame> read = this.repository.findById(savedNewGame.getCreateName());
        System.out.println("In read, read = " + read);
        c_getAll();
        Assert.assertEquals(savedNewGame, read);
    }


    @Test
    public void e_delete() {
        NewGame savedNewGame = getSavedNewGame();
        this.repository.deleteById(savedNewGame.getCreateName());
        c_getAll();
    }

    @Test
    public void d_update() {
        String createNewGameName = "FifaGame1";
        NewGame NewGame = new NewGame.Builder().createName(createNewGameName).build();
        System.out.println("In update, about_to_updated = " +NewGame);
        NewGame updated = this.repository.save(NewGame);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createNewGameName, updated.getCreateName());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        List<NewGame> all = this.repository.findAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
