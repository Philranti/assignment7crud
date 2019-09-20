package za.ac.cput.projects.assignment7crud.domains.PlayerStats;

import java.util.Objects;

public class TopGoalScorers extends PlayerStats {
    private int numOfGoalsScored;

    public TopGoalScorers() {
    }

    private TopGoalScorers(Builder builder) {
        this.numOfGoalsScored = builder.numOfGoalsScored;

    }

    public int getNumOfGoalsScored()
    {
        return numOfGoalsScored;
    }

    public static class Builder{

        private int numOfGoalsScored;



        public Builder numOfGoalsScored(int numOfGoalsScored) {
            this.numOfGoalsScored = numOfGoalsScored;
            return this;
        }



        public TopGoalScorers build() {
            return new TopGoalScorers(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopGoalScorers that = (TopGoalScorers) o;
        return numOfGoalsScored == that.numOfGoalsScored;
    }

    @Override
    public int hashCode() {

        return Objects.hash(numOfGoalsScored);
    }

    @Override
    public String toString() {
        return "TopGoalScorers{" +
                "numOfGoalsScored=" + numOfGoalsScored +
                '}';
    }
}
