package za.ac.cput.projects.assignment7crud.serviceTest.ExhibitionServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.projects.assignment7crud.domains.ExhibitionMatches.GamePlay;
import za.ac.cput.projects.assignment7crud.factory.ExhibitionFactory.GamePlayFactory;
import za.ac.cput.projects.assignment7crud.repositories.exhibition_repository.GamePlayerRepositories;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GamePlaySerTest {

    private GamePlayerRepositories repository;
    private GamePlay gamePlay;

    private GamePlay getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GamePlayerRepositories.getRepository();
        this.gamePlay = GamePlayFactory.createGamePlay("Two Player", 30, true, true, 6, "Old Trafford" );
    }

    @Test
    public void a_create() {
        GamePlay created = this.repository.create(this.gamePlay);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.gamePlay);
    }

    @Test
    public void c_update() {
        String choosePlayMode = "One Player";
        GamePlay updated = new GamePlay.Builder().playerMode(choosePlayMode).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(choosePlayMode, updated.getPlayerMode());
    }

    @Test
    public void e_delete() {
        GamePlay saved = getSaved();
        this.repository.delete(saved.getPlayerMode());
        d_getAll();
    }

    @Test
    public void b_read() {
        GamePlay saved = getSaved();
        GamePlay read = this.repository.read(saved.getPlayerMode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<GamePlay> GamePlay = this.repository.getAll();
        System.out.println("In getall, all = " + GamePlay);
    }
}
