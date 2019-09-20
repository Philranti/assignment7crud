package za.ac.cput.projects.assignment7crud.domains.MasterLeagues;

import java.util.Objects;

public class PromotePlayers {
    private String promotedPlayer;

    public PromotePlayers() {
    }

    private PromotePlayers(Builder builder) {
        this.promotedPlayer = builder.promotedPlayer;

    }

    public String getPromotedPlayer() {
        return promotedPlayer;
    }

    public static class Builder{

        private String promotedPlayer;



        public Builder promotedPlayer(String promotedPlayer) {
            this.promotedPlayer = promotedPlayer;
            return this;
        }

        public PromotePlayers.Builder copy(PromotePlayers promotePlayers){
            this.promotedPlayer = promotePlayers.promotedPlayer;
            return this;
        }

        public PromotePlayers build() {
            return new PromotePlayers(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotePlayers that = (PromotePlayers) o;
        return Objects.equals(promotedPlayer, that.promotedPlayer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(promotedPlayer);
    }

    @Override
    public String toString() {
        return "PromotePlayers{" +
                "promotedPlayer='" + promotedPlayer + '\'' +
                '}';
    }
}
