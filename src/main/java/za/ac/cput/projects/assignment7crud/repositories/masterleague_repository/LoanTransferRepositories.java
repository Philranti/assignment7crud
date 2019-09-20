package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;



import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;

import java.util.HashSet;
import java.util.Set;

public class LoanTransferRepositories implements LoanTransferRepository {
    private static LoanTransferRepositories repository = null;
    private Set<LoanTransfers> loan;


    private LoanTransferRepositories(){
        this.loan = new HashSet<>();
    }

    public static LoanTransferRepositories getRepository(){
        if (repository == null) repository = new LoanTransferRepositories();
        return repository;
    }

    public LoanTransfers create(LoanTransfers loan){
        this.loan.add(loan);
        return loan;
    }

    public LoanTransfers read(String loan){

        return null;
    }

    public void delete(String loanId) {

        this.loan.remove(loanId);
    }

    public LoanTransfers update(LoanTransfers loan){

        return loan;
    }


    public Set<LoanTransfers> getAll(){
        return this.loan;
    }
}
