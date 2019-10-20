package za.ac.cput.projects.assignment7crud.controllers.WebControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.projects.assignment7crud.SoccerGameMenu;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServices;

import java.util.List;

//import static jdk.javadoc.internal.doclets.formats.html.markup.Table.*;


@Controller
public class MenuController {

    @Autowired
    NewGameServices services;

	@RequestMapping("/")
	@ResponseBody
	public String showWelcomePage() {

		return "All Employees.html";
	}

	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		
		return principal.toString();
	}



}
