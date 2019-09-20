package za.ac.cput.projects.assignment7crud.domains.PlayerStats;

import java.util.Objects;

public class MostRedCards extends PlayerStats {
    private int numOfRedCards;

    public MostRedCards() {
    }

    private MostRedCards(Builder builder) {
        this.numOfRedCards = builder.numOfRedCards;

    }

    public int getNumOfRedCards() {
        return numOfRedCards;
    }

    public static class Builder{

        private int numOfRedCards;



        public Builder numOfRedCards(int numOfRedCards) {
            this.numOfRedCards = numOfRedCards;
            return this;
        }



        public MostRedCards build() {
            return new MostRedCards(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MostRedCards that = (MostRedCards) o;
        return getNumOfRedCards() == that.getNumOfRedCards();
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getNumOfRedCards());
    }

    @Override
    public String toString() {
        return "MostRedCards{" +
                "numOfRedCards=" + numOfRedCards +
                '}';
    }
}
