package za.ac.cput.projects.assignment7crud.repositories.masterleague_repository;



import za.ac.cput.projects.assignment7crud.domains.MasterLeagues.LoanTransfers;

import java.util.Set;

public interface LoanTransferRepository extends MasterLeagueMainRepository<LoanTransfers, String> {
    Set<LoanTransfers> getAll();
}

