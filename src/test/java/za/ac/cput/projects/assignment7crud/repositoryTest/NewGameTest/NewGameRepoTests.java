package za.ac.cput.projects.assignment7crud.repositoryTest.NewGameTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.NewGameTest.NewGameTests;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepositories;
import za.ac.cput.projects.assignment7crud.repositories.newgame_repository.CreateNewGameRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewGameRepoTests {
    private NewGame newGame;

    private CreateNewGameRepository repository;
    private NewGameTests NewGameTest;


    private NewGame getSavedNewGame() {
        Set<NewGame> savedNewGameTransfer = this.repository.getAll();
        return savedNewGameTransfer.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CreateNewGameRepositories.getRepository();
       // this.newGame = NewGameTest.setUp();
    }

    @Test
    public void create() {
        NewGame created = this.repository.create(this.newGame);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.newGame);
    }

    @Test
    public void read() {
        NewGame savedNewGame = getSavedNewGame();

        NewGame read = this.repository.read(savedNewGame.getCreateName());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedNewGame, read);
    }

    private NewGame getsavedNewGameTransfer() {
        Set<NewGame> savedNewGameTransfer = this.repository.getAll();
        return savedNewGameTransfer.iterator().next();
    }

    @Test
    public void delete() {
        NewGame savedNewGame = getSavedNewGame();
        this.repository.delete(savedNewGame.getCreateName());
        getAll();
    }

    @Test
    public void update() {
        String createNewGameName = "FifaGame1";
        NewGame NewGame = new NewGame.Builder().createName(createNewGameName).build();
        System.out.println("In update, about_to_updated = " +NewGame);
        NewGame updated = this.repository.update(NewGame);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(createNewGameName, updated.getCreateName());
        getAll();
    }

    @Test
    public void getAll() {
        Set<NewGame> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
