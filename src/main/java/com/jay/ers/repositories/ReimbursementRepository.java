package com.jay.ers.repositories;

import com.jay.ers.entities.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Long> {
    List<Reimbursement> findAllByStatusId(Optional<Long> statusId);

    List<Reimbursement> findAllByAuthorId(Long userId);

    List<Reimbursement> findAllByAuthorIdAndStatusId(Long userId, Optional<Long> statusId);

    List<Reimbursement> findAllByTypeId(Optional<Long> typeId);

    List<Reimbursement> findAllByStatusIdAndTypeId(Optional<Long> statusId, Optional<Long> typeId);

    List<Reimbursement> findAllByAuthorIdAndTypeId(Long userId, Optional<Long> typeId);

    List<Reimbursement> findAllByAuthorIdAndStatusIdAndTypeId(Long userId, Optional<Long> statusId, Optional<Long> typeId);
}
