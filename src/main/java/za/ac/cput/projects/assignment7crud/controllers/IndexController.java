package za.ac.cput.projects.assignment7crud.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {


    @RequestMapping(value = {"/soccer"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("This is a Soccer Game!", HttpStatus.OK);
    }

        @GetMapping("/soccer/hello")
    @ResponseBody
    public String getHome() {
        return " Hello There ";
    }
}
