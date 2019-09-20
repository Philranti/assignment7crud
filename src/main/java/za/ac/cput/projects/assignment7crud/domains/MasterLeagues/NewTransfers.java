package za.ac.cput.projects.assignment7crud.domains.MasterLeagues;

import java.util.Objects;

public class NewTransfers extends Transfers  {
    private String newPlayerName;
    private double transferFee;

    public NewTransfers() {
    }

    private NewTransfers(Builder builder) {
        this.newPlayerName = builder.newPlayerName;
        this.transferFee = builder.transferFee;
    }

    public String getNewPlayerName() {
        return newPlayerName;
    }

    public double getTransferFee() {
        return transferFee;
    }

    public static class Builder{

        private String newPlayerName;
        private double transferFee;


        public Builder newPlayerName(String newPlayerName) {
            this.newPlayerName = newPlayerName;
            return this;
        }

        public Builder transferFee(double transferFee) {
            this.transferFee = transferFee;
            return this;
        }

        public NewTransfers.Builder copy(NewTransfers newTransfers){
            this.newPlayerName = newTransfers.newPlayerName;
            this.transferFee = newTransfers.transferFee;
            return this;
        }

        public NewTransfers build() {
            return new NewTransfers(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewTransfers that = (NewTransfers) o;
        return Double.compare(that.getTransferFee(), getTransferFee()) == 0 &&
                Objects.equals(getNewPlayerName(), that.getNewPlayerName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getNewPlayerName(), getTransferFee());
    }

    @Override
    public String toString() {
        return "NewTransfers{" +
                "newPlayerName='" + newPlayerName + '\'' +
                ", transferFee=" + transferFee +
                '}';
    }
}

