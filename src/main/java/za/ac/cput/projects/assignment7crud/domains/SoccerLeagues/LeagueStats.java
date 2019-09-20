package za.ac.cput.projects.assignment7crud.domains.SoccerLeagues;

import java.util.Objects;

public class LeagueStats {
   private String mostLeagueTitles;
    private String mostWins;
    private String mostLoses;
    private String mostPoints;

    public LeagueStats() {
    }

    private LeagueStats(Builder builder) {
        this.mostLeagueTitles = builder.mostLeagueTitles;
        this.mostWins = builder.mostWins;
        this.mostLoses = builder.mostLoses;
        this.mostPoints = builder.mostPoints;

    }

    public String getMostLeagueTitles() {
        return mostLeagueTitles;
    }

    public String getMostWins() {
        return mostWins;
    }

    public String getMostLoses() {
        return mostLoses;
    }

    public String getMostPoints() {
        return mostPoints;
    }

    public static class Builder{

        private String mostLeagueTitles;
        private String mostWins;
        private String mostLoses;
        private String mostPoints;


        public Builder mostLeagueTitles(String mostLeagueTitles) {
            this.mostLeagueTitles = mostLeagueTitles;
            return this;
        }

        public Builder mostWins(String mostWins) {
            this.mostWins = mostWins;
            return this;
        }

        public Builder mostLoses(String mostLoses) {
            this.mostLoses = mostLoses;
            return this;
        }

        public Builder mostPoints(String mostPoints) {
            this.mostPoints = mostPoints;
            return this;
        }


        public LeagueStats build() {
            return new LeagueStats(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeagueStats that = (LeagueStats) o;
        return Objects.equals(getMostLeagueTitles(), that.getMostLeagueTitles()) &&
                Objects.equals(getMostWins(), that.getMostWins()) &&
                Objects.equals(getMostLoses(), that.getMostLoses()) &&
                Objects.equals(getMostPoints(), that.getMostPoints());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMostLeagueTitles(), getMostWins(), getMostLoses(), getMostPoints());
    }

    @Override
    public String toString() {
        return "LeagueStats{" +
                "mostLeagueTitles='" + mostLeagueTitles + '\'' +
                ", mostWins='" + mostWins + '\'' +
                ", mostLoses='" + mostLoses + '\'' +
                ", mostPoints='" + mostPoints + '\'' +
                '}';
    }
}
