package za.ac.cput.projects.assignment7crud.domains.MasterLeagues;

import java.util.Objects;

public class FreeAgents extends Transfers {
    private String freeAgentPlayer;

    public FreeAgents() {
    }

    private FreeAgents(Builder builder) {
        this.freeAgentPlayer = builder.freeAgentPlayer;

    }

    public String getFreeAgentPlayer() {
        return freeAgentPlayer;
    }

    public static class Builder{

        private String freeAgentPlayer;

        public Builder freeAgentPlayer(String freeAgentPlayer) {
            this.freeAgentPlayer = freeAgentPlayer;
            return this;
        }

        public FreeAgents.Builder copy(FreeAgents freeAgents){
            this.freeAgentPlayer = freeAgents.freeAgentPlayer;
            return this;
        }



        public FreeAgents build() {
            return new FreeAgents(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeAgents that = (FreeAgents) o;
        return Objects.equals(freeAgentPlayer, that.freeAgentPlayer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(freeAgentPlayer);
    }

    @Override
    public String toString() {
        return "FreeAgents{" +
                "freeAgentPlayer='" + freeAgentPlayer + '\'' +
                '}';
    }
}
