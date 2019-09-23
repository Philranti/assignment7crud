package za.ac.cput.projects.assignment7crud.controllerTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.factory.NewGameFactory.CreateNewGameFactory;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NewGameController  {



    @Autowired
    private TestRestTemplate restTemplate;
    private String BASE_URL = "http://localhost:8080/soccer/lookup/newGame";


    @Test
    public void a_create() {

        NewGame newGame = CreateNewGameFactory.newGame("PhillipGame", "PhilGame" );
        newGame.setCreateName("PhillipGame");
        ResponseEntity<NewGame> postResponse = restTemplate.postForEntity(BASE_URL + "/newGame", newGame, NewGame.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    /*@Test
    public void createNewGame() {
        ResponseEntity result = restTemplate.withBasicAuth("admin", "admin")
                .postForEntity(BASE_URL + "/create/newGame", null, String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }*/

    @Test
    public void b_findById() {

        NewGame newGame = restTemplate.getForObject(BASE_URL + "/find/" + "PhillipGame", NewGame.class);
        assertNotNull(newGame);
        System.out.println(newGame.getCreateName());

    }


    @Test
    public void getAll() {
        ResponseEntity<String> result = restTemplate.withBasicAuth("user", "password")
                .getForEntity(BASE_URL + "/getAll", String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }


}
