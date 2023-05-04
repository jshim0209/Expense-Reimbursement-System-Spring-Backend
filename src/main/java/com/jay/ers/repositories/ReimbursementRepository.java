package com.jay.ers.repositories;

import com.jay.ers.entities.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Long> {
    List<Reimbursement> findAllByStatus(String status);
}
