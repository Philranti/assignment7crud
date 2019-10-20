package za.ac.cput.projects.assignment7crud.repositoryTest.ExhibitionTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.GamePlayFactory;
import za.ac.cput.projects.assignment7crud.factoryTest.ExhibitionTest.GamePlayTest;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.GamePlayerRepository;

import java.util.List;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GamePlayRepoTest {
    private GamePlay game;

    private GamePlayerRepository repository;
    private GamePlayTest gamePlayTest;


    private GamePlay getSavedGamePlay() {
        List<GamePlay> savedGamePlay = this.repository.findAll();
        return savedGamePlay.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
      //  this.repository = GamePlayerRepositories.getRepository();
       this.game = GamePlayFactory.createGamePlay("Two Player", 30, true, true, 6, "Old Trafford" );
    }




    @Test
    public void a_create() {
        GamePlay create = this.repository.save(this.game);
        System.out.println("In create, created = " + create);
        c_getAll();
        Assert.assertSame(create, this.game);
    }

    @Test
    public void b_read() {
        GamePlay savedGamePlay = getSavedGamePlay();

       // GamePlay read = this.repository.read(savedGamePlay.getPlayerMode());
        System.out.println("In read, read = " + savedGamePlay);
        c_getAll();
        Assert.assertNotNull(savedGamePlay);
    }



    @Test
    public void e_delete() {
        GamePlay savedGamePlay = getSavedGamePlay();
        this.repository.deleteById(savedGamePlay.getGamePlayId());
        c_getAll();
    }

    @Test
    public void d_update() {
        String gamePlayName = "One Player";
        GamePlay gamePlay = new GamePlay.Builder().copy(getSavedGamePlay()).playerMode(gamePlayName).build();
        System.out.println("In update, about_to_updated = " +gamePlay);
       // GamePlay updated = this.repository.update(gamePlay);
        System.out.println("In update, updated = " + gamePlay);
        Assert.assertSame(gamePlayName, gamePlay.getPlayerMode());
        c_getAll();
    }

    @Test
    public void c_getAll() {
        List<GamePlay> all = this.repository.findAll();
        System.out.println("In getAll, all = " + all);
//       Assert.assertSame(1, all.size());
    }


}
