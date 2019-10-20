package za.ac.cput.projects.assignment7crud.repositories.cuptournament_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.projects.assignment7crud.domains.CupsTournament.InternationalTournaments;
import za.ac.cput.projects.assignment7crud.repositories.SoccerGameMainRepository;

import java.util.Set;

@Repository
public interface InternationalRepository extends JpaRepository<InternationalTournaments, String> {
    }
