package com.jay.ers.services.impl;

import com.jay.ers.dtos.ReimbursementDto;
import com.jay.ers.entities.Reimbursement;
import com.jay.ers.mappers.ReimbursementMapper;
import com.jay.ers.repositories.ReimbursementRepository;
import com.jay.ers.services.ReimbursementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReimbursementServiceImpl implements ReimbursementService {
    private final ReimbursementRepository reimbursementRepository;
    private final ReimbursementMapper reimbursementMapper;
    @Override
    public List<ReimbursementDto> getAllReimbursementsByStatus(String status) {
        List<Reimbursement> reimbursements = reimbursementRepository.findAllByStatus(status);
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }

    @Override
    public List<ReimbursementDto> getAllReimbursements() {
        List<Reimbursement> reimbursements = reimbursementRepository.findAll();
        return reimbursementMapper.entitiesToDtos(reimbursements);
    }
}
