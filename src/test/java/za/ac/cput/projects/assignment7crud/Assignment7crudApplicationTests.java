package za.ac.cput.projects.assignment7crud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Assignment7crudApplicationTests {

    @RequestMapping(path = "/test")
    @Test
    public void contextLoads() {
        System.out.println("Hello World!!");
    }

}
