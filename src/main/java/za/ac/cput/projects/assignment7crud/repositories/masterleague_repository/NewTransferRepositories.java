package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;

import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.NewTransfers;

import java.util.HashSet;
import java.util.Set;

public class NewTransferRepositories implements NewTransferRepository{
    private static NewTransferRepositories repository = null;
    private Set<NewTransfers> newTransfer;


    private NewTransferRepositories(){
        this.newTransfer = new HashSet<>();
    }

    public static NewTransferRepositories getRepository(){
        if (repository == null) repository = new NewTransferRepositories();
        return repository;
    }

    public NewTransfers create(NewTransfers newTransfer){
        this.newTransfer.add(newTransfer);
        return newTransfer;
    }

    public NewTransfers read(String newTransfer){

        return null;
    }

    public void delete(String newTransferId) {

        this.newTransfer.remove(newTransferId);
    }

    public NewTransfers update(NewTransfers newTransfer){

        return newTransfer;
    }


    public Set<NewTransfers> getAll(){
        return this.newTransfer;
    }
}
