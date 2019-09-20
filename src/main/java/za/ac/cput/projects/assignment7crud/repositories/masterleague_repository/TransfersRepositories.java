package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.Transfers;

import java.util.HashSet;
import java.util.Set;

public class TransfersRepositories implements TransfersRepository {
    private static TransfersRepositories repository = null;
    private Set<Transfers> transfer;


    private TransfersRepositories(){
        this.transfer = new HashSet<>();
    }

    public static TransfersRepositories getRepository(){
        if (repository == null) repository = new TransfersRepositories();
        return repository;
    }

    public Transfers create(Transfers transfer){
        this.transfer.add(transfer);
        return transfer;
    }

    public Transfers read(String transfer){

        return null;
    }

    public void delete(String transferId) {

        this.transfer.remove(transferId);
    }

    public Transfers update(Transfers transfer){

        return transfer;
    }


    public Set<Transfers> getAll(){
        return this.transfer;
    }
}
