package za.ac.cput.projects.assignment7crud.domains.PlayerStats;

import java.util.Objects;

public class MostYellowCards extends PlayerStats {
    private int numOfYellowCards;

    public MostYellowCards() {
    }

    private MostYellowCards(Builder builder) {
        this.numOfYellowCards = builder.numOfYellowCards;

    }

    public int getNumOfYellowCards() {
        return numOfYellowCards;
    }

    public static class Builder{

        private int numOfYellowCards;



        public Builder numOfYellowCards(int numOfYellowCards) {
            this.numOfYellowCards = numOfYellowCards;
            return this;
        }



        public MostYellowCards build() {
            return new MostYellowCards(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MostYellowCards that = (MostYellowCards) o;
        return numOfYellowCards == that.numOfYellowCards;
    }

    @Override
    public int hashCode() {

        return Objects.hash(numOfYellowCards);
    }

    @Override
    public String toString() {
        return "MostYellowCards{" +
                "numOfYellowCards=" + numOfYellowCards +
                '}';
    }
}
