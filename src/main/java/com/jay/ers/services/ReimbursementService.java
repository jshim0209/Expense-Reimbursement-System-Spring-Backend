package com.jay.ers.services;

import com.jay.ers.dtos.ReimbursementDto;
import com.jay.ers.dtos.ReimbursementRequestDto;

import java.util.List;
import java.util.Optional;

public interface ReimbursementService {
    List<ReimbursementDto> getAllReimbursementsByStatus(Optional<Long> statusId);

    List<ReimbursementDto> getAllReimbursements();

    List<ReimbursementDto> getReimbursementsByUserId(Long userId);

    List<ReimbursementDto> getReimbursementsForUserByStatus(Long userId, Optional<Long> statusId);

    ReimbursementDto addReimbursement(Long userId, ReimbursementRequestDto reimbursementRequestDto);

    List<ReimbursementDto> getAllReimbursementsByType(Optional<Long> typeId);

    List<ReimbursementDto> getAllReimbursementsByStatusAndType(Optional<Long> statusId, Optional<Long> typeId);


    List<ReimbursementDto> getAllReimbursementsForUserByType(Long userId, Optional<Long> typeId);

    List<ReimbursementDto> getAllReimbursementsForUserByStatusAndType(Long userId, Optional<Long> statusId, Optional<Long> typeId);
}
