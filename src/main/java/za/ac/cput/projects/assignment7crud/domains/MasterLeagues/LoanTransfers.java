package za.ac.cput.projects.assignment7crud.domains.MasterLeagues;

import java.util.Objects;

public class LoanTransfers extends Transfers {
    private String loanedPlayer;
    private double loanFee;
    private int loanDurationYear;

    public LoanTransfers() {
    }

    private LoanTransfers(Builder builder) {
        this.loanedPlayer = builder.loanedPlayer;
        this.loanFee = builder.loanFee;
        this.loanDurationYear = builder.loanDurationYear;
    }

    public String getLoanedPlayer() {
        return loanedPlayer;
    }

    public double getLoanFee() {
        return loanFee;
    }

    public int getLoanDurationYear() {
        return loanDurationYear;
    }

    public static class Builder{

        private String loanedPlayer;
        private double loanFee;
        private int loanDurationYear;


        public Builder loanedPlayer(String loanedPlayer) {
            this.loanedPlayer = loanedPlayer;
            return this;
        }

        public Builder loanFee(double loanFee) {
            this.loanFee = loanFee;
            return this;
        }

        public Builder loanDurationYear(int loanDurationYear) {
            this.loanDurationYear = loanDurationYear;
            return this;
        }

        public LoanTransfers.Builder copy(LoanTransfers loanTransfers){
            this.loanedPlayer = loanTransfers.loanedPlayer;
            this.loanFee = loanTransfers.loanFee;
            this.loanDurationYear = loanTransfers.loanDurationYear;
            return this;
        }

        public LoanTransfers build()
        {
            return new LoanTransfers(this);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LoanTransfers that = (LoanTransfers) o;
        return Double.compare(that.loanFee, loanFee) == 0 &&
                loanDurationYear == that.loanDurationYear &&
                Objects.equals(loanedPlayer, that.loanedPlayer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), loanedPlayer, loanFee, loanDurationYear);
    }

    @Override
    public String toString() {
        return "LoanTransfers{" +
                "loanedPlayer='" + loanedPlayer + '\'' +
                ", loanFee=" + loanFee +
                ", loanDurationYear=" + loanDurationYear +
                '}';
    }
}
