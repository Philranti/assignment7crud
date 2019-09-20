package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.TransferListed;

import java.util.HashSet;
import java.util.Set;

public class TransferListedRepositories implements TransferListedRepository{
    private static TransferListedRepositories repository = null;
    private Set<TransferListed> transferList;


    private TransferListedRepositories(){
        this.transferList = new HashSet<>();
    }

    public static TransferListedRepositories getRepository(){
        if (repository == null) repository = new TransferListedRepositories();
        return repository;
    }

    public TransferListed create(TransferListed transferList){
        this.transferList.add(transferList);
        return transferList;
    }

    public TransferListed read(String transferList){

        return null;
    }

    public void delete(String transferListId) {

        this.transferList.remove(transferListId);
    }

    public TransferListed update(TransferListed transferList){

        return transferList;
    }


    public Set<TransferListed> getAll(){
        return this.transferList;
    }
}
