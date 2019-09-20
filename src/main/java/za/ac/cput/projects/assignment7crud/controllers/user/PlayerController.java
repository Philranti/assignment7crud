package za.ac.cput.projects.assignment7crud.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.cput.projects.assignment7crud.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.assignment7crud.services.CreateNewgameServices.NewGameServiceImpl;

public class PlayerController {
 /*   @Autowired
    private NewGameServiceImpl newGameService;
    @Autowired
    private RaceServiceImpl raceService;
    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private EmployeeGenderServiceImpl employeeGenderService;
    @Autowired
    private EmployeeRaceServiceImpl employeeRaceService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEmployee(@RequestBody NewEmployee employee) {
        System.out.println(employee);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Employee created!");
        if (employee.getFirstName() == null || employee.getLastName() == null) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Please provide first and/or last name!");
        } else {
            Gender gender = getGender(employee);
            Race race = getRace(employee);
            if (gender == null || race == null) {
                responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String message = gender == null ? "Gender not found|" : "";
                message += race == null ? "Race not found" : "";
                responseObj.setResponseDescription(message);
            } else {
                Employee savedEmp = saveEmployee(employee);
                EmployeeGender savedEmpGender = saveEmployeeGender(savedEmp, gender);
                EmployeeRace savedEmpRace = saveEmployeeRace(savedEmp, race);
                responseObj.setResponse(savedEmp);
            }
        }
        return ResponseEntity.ok(responseObj);
    }

    private EmployeeRace saveEmployeeRace(Employee savedEmp, Race race) {
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace(savedEmp.getEmail(), race.getId());
        return employeeRaceService.create(employeeRace);
    }

    private EmployeeGender saveEmployeeGender(Employee savedEmp, Gender gender) {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(savedEmp.getEmail(), gender.getId());
        return employeeGenderService.create(employeeGender);
    }

    private Employee saveEmployee(NewEmployee employee) {
        Employee emp = EmployeeFactory.buildEmployee(employee.getEmail(), employee.getFirstName(), employee.getLastName());
        return employeeService.create(emp);
    }

    private Race getRace(NewEmployee employee) {
        return raceService.retrieveByDesc(employee.getRace());
    }

    private NewGame getNewGame(NewGame newGame) {
        return newGameService.retrieveByDesc(newGame.getCreateName());
    }*/
}
