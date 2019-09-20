package za.ac.cput.projects.assignment7crud.domains.PlayerStats;

import java.util.Objects;

public class MostCleanSheets extends PlayerStats {
    private int numOfCleanSheets;
    private int numOfGoalsConceded;

    public MostCleanSheets() {
    }

    private MostCleanSheets(Builder builder) {
        this.numOfGoalsConceded = builder.numOfGoalsConceded;
        this.numOfCleanSheets = builder.numOfCleanSheets;
    }

    public int getNumOfCleanSheets() {
        return numOfCleanSheets;
    }

    public int getNumOfGoalsConceded() {
        return numOfGoalsConceded;
    }

    public static class Builder {

        private int numOfCleanSheets;
        private int numOfGoalsConceded;

        public Builder numOfCleanSheets(int numOfCleanSheets) {
            this.numOfCleanSheets = numOfCleanSheets;
            return this;
        }

        public Builder numOfGoalsConceded(int numOfGoalsConceded) {
            this.numOfGoalsConceded = numOfGoalsConceded;
            return this;
        }

        public MostCleanSheets build() {
            return new MostCleanSheets(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return numOfCleanSheets == builder.numOfCleanSheets &&
                    numOfGoalsConceded == builder.numOfGoalsConceded;
        }

        @Override
        public int hashCode() {
            return Objects.hash(numOfCleanSheets, numOfGoalsConceded);
        }

        @Override
        public String toString() {
            return "MostCleanSheets{" +
                    "numOfCleanSheets=" + numOfCleanSheets +
                    ", numOfGoalsConceded=" + numOfGoalsConceded +
                    '}';
        }
    }
}
