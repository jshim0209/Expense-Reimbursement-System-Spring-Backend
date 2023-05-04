package com.jay.ers.services;

import com.jay.ers.dtos.ReimbursementDto;

import java.util.List;

public interface ReimbursementService {
    List<ReimbursementDto> getAllReimbursementsByStatus(String status);

    List<ReimbursementDto> getAllReimbursements();
}
