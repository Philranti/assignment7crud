package za.ac.cput.projects.assignment7crud.serviceTest.SoccerGameServTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.SoccerGame.ExhibitionMatch;
import za.ac.cput.projects.assignment7crud.factory.SoccerGameFactory.ExhibitionFactory;
import za.ac.cput.projects.assignment7crud.repositories.soccergame_repository.ExhibitionRepositories;

import java.util.Set;

public class ExhibitionSerTest {

    private ExhibitionRepositories repository;
    private ExhibitionMatch exhibitionMatch;

    private ExhibitionMatch getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = ExhibitionRepositories.getRepository();
        this.exhibitionMatch = ExhibitionFactory.createExhibition("1-0", "Player One",false);
    }

    @Test
    public void a_create() {
        ExhibitionMatch created = this.repository.create(this.exhibitionMatch);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.exhibitionMatch);
    }

    @Test
    public void c_update() {
        String renameExhibitionMatch = "Player Two";
        ExhibitionMatch updated = new ExhibitionMatch.Builder().playerWon(renameExhibitionMatch).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(renameExhibitionMatch, updated.getPlayerWon());
    }

    @Test
    public void e_delete() {
        ExhibitionMatch saved = getSaved();
        this.repository.delete(Integer.parseInt(saved.getPlayerWon()));
        d_getAll();
    }

    @Test
    public void b_read() {
        ExhibitionMatch saved = getSaved();
        ExhibitionMatch read = this.repository.read(Integer.parseInt(saved.getPlayerWon()));
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<ExhibitionMatch> ExhibitionMatch = this.repository.getAll();
        System.out.println("In getall, all = " + ExhibitionMatch);
    }

}
