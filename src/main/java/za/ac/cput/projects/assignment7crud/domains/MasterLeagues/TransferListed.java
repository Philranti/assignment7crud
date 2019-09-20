package za.ac.cput.projects.assignment7crud.domains.MasterLeagues;

import java.util.Objects;

public class TransferListed extends Transfers{
    private String transferedPlayer;
    private String teamInterested;

    public TransferListed() {
    }

    private TransferListed(Builder builder) {
        this.transferedPlayer = builder.transferedPlayer;
        this.teamInterested = builder.teamInterested;
    }

    public String getTransferedPlayer() {
        return transferedPlayer;
    }

    public String getTeamInterested() {
        return teamInterested;
    }

    public static class Builder{

        private String transferedPlayer;
        private String teamInterested;


        public Builder transferedPlayer(String transferedPlayer) {
            this.transferedPlayer = transferedPlayer;
            return this;
        }

        public Builder teamInterested(String teamInterested) {
            this.teamInterested = teamInterested;
            return this;
        }

        public TransferListed.Builder copy(TransferListed transferListed){
            this.transferedPlayer = transferListed.transferedPlayer;
            this.teamInterested = transferListed.teamInterested;
            return this;
        }

        public TransferListed build() {
            return new TransferListed(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransferListed that = (TransferListed) o;
        return Objects.equals(transferedPlayer, that.transferedPlayer) &&
                Objects.equals(teamInterested, that.teamInterested);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), transferedPlayer, teamInterested);
    }

    @Override
    public String toString() {
        return "TransferListed{" +
                "transferedPlayer='" + transferedPlayer + '\'' +
                ", teamInterested='" + teamInterested + '\'' +
                '}';
    }
}
