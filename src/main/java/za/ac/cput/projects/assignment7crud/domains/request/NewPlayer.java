package za.ac.cput.projects.assignment7crud.domains.request;

public class NewPlayer {
    private String firstName, lastName, email, newGameName, tournamentType, chosenTeam;

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewGameName() {
        return newGameName;
    }

    public void setNewGameName(String newGameName) {
        this.newGameName = newGameName;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public String getChosenTeam() {
        return chosenTeam;
    }

    public void setChosenTeam(String chosenTeam) {
        this.chosenTeam = chosenTeam;
    }

    @Override
    public String toString() {
        return "NewPlayer{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", newGameName='" + newGameName + '\'' +
                ", tournamentType='" + tournamentType + '\'' +
                ", chosenTeam='" + chosenTeam + '\'' +
                '}';
    }
}
