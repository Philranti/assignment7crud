package za.ac.cput.projects.assignment7crud.domains.MasterLeagues;
import java.util.Objects;

public class Transfers {
    private int playersRating;
    private int age;
    private String playersPosition;
    private String previousClub;
    private String currentClub;

    public Transfers() {
    }

    private Transfers(Builder builder) {
        this.playersRating = builder.playersRating;
        this.age = builder.age;
        this.playersPosition = builder.playersPosition;
        this.previousClub = builder.previousClub;
        this.currentClub = builder.currentClub;

    }

    public int getPlayersRating() {
        return playersRating;
    }

    public int getAge() {
        return age;
    }

    public String getPlayersPosition() {
        return playersPosition;
    }

    public String getPreviousClub() {
        return previousClub;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public static class Builder{

        private int playersRating;
        private int age;
        private String playersPosition;
        private String previousClub;
        private String currentClub;

        public Builder playersRating(int playersRating) {
            this.playersRating = playersRating;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder playersPosition(String playersPosition) {
            this.playersPosition = playersPosition;
            return this;
        }

        public Builder previousClub(String previousClub) {
            this.previousClub = previousClub;
            return this;
        }

        public Builder currentClub(String currentClub) {
            this.currentClub = currentClub;
            return this;
        }

        public Transfers.Builder copy(Transfers transfers){
            this.playersRating = transfers.playersRating;
            this.age = transfers.age;
            this.playersPosition = transfers.playersPosition;
            this.previousClub = transfers.previousClub;
            this.currentClub = transfers.currentClub;
            return this;
        }

        public Transfers build() {
            return new Transfers(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfers transfers = (Transfers) o;
        return playersRating == transfers.playersRating &&
                age == transfers.age &&
                Objects.equals(playersPosition, transfers.playersPosition) &&
                Objects.equals(previousClub, transfers.previousClub) &&
                Objects.equals(currentClub, transfers.currentClub);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playersRating, age, playersPosition, previousClub, currentClub);
    }

    @Override
    public String toString() {
        return "Transfers{" +
                "playersRating=" + playersRating +
                ", age=" + age +
                ", playersPosition='" + playersPosition + '\'' +
                ", previousClub='" + previousClub + '\'' +
                ", currentClub='" + currentClub + '\'' +
                '}';
    }
}
