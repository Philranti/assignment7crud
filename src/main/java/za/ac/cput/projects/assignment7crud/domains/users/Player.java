package za.ac.cput.projects.assignment7crud.domains.users;

import sun.security.provider.certpath.Builder;

public class Player {
    private String firstName, lastName, email;

    private Player() {
    }

    public Player(Builder builder) {
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{
        private String email, firstName, lastName;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Player player) {
            this.email = player.email;
            this.firstName = player.firstName;
            this.lastName = player.lastName;

            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }


}
