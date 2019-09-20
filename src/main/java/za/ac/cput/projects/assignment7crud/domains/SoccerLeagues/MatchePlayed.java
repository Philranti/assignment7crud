package za.ac.cput.projects.assignment7crud.domains.SoccerLeagues;

import java.util.Objects;

public class MatchePlayed {
    private int playedMatches;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;

    public MatchePlayed() {
    }

    private MatchePlayed(Builder builder) {
        this.playedMatches = builder.playedMatches;
        this.matchesWon = builder.matchesWon;
        this.matchesDrawn = builder.matchesDrawn;
        this.matchesLost = builder.matchesLost;

    }

    public int getPlayedMatches() {
        return playedMatches;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public static class Builder{

        private int playedMatches;
        private int matchesWon;
        private int matchesDrawn;
        private int matchesLost;


        public Builder playedMatches(int playedMatches) {
            this.playedMatches = playedMatches;
            return this;
        }

        public Builder matchesWon(int matchesWon) {
            this.matchesWon = matchesWon;
            return this;
        }

        public Builder matchesDrawn(int matchesDrawn) {
            this.matchesDrawn = matchesDrawn;
            return this;
        }

        public Builder matchesLost(int matchesLost) {
            this.matchesLost = matchesLost;
            return this;
        }



        public MatchePlayed build() {
            return new MatchePlayed(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchePlayed that = (MatchePlayed) o;
        return playedMatches == that.playedMatches &&
                matchesWon == that.matchesWon &&
                matchesDrawn == that.matchesDrawn &&
                matchesLost == that.matchesLost;
    }

    @Override
    public int hashCode() {

        return Objects.hash(playedMatches, matchesWon, matchesDrawn, matchesLost);
    }

    @Override
    public String toString() {
        return "MatchePlayed{" +
                "playedMatches=" + playedMatches +
                ", matchesWon=" + matchesWon +
                ", matchesDrew=" + matchesDrawn +
                ", matchesLost=" + matchesLost +
                '}';
    }
}
